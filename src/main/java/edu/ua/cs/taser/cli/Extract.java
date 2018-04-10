package edu.ua.cs.taser.cli;

import edu.ua.cs.taser.cli.args.RealizedArgs;
import edu.ua.cs.taser.common.LoadFileContent;
import edu.ua.cs.taser.javatext.ExtractJavaDocument;
import edu.ua.cs.taser.javatext.WriteJavaDocument;
import edu.ua.cs.taser.util.function.Functors;
import edu.ua.cs.taser.util.function.Predicates;

//jars from elsewhere
import rx.schedulers.Schedulers;
import static rx.Observable.from;

public final class Extract {

    public static void execute(final RealizedArgs args) {
        
        //from statement returns the Observable from a list of input files
        from(args.getInputFiles())	
            .parallel(Functors.map(new LoadFileContent()), Schedulers.io())
            .filter(Predicates.fileContentNotEmpty())
            .parallel(Functors.map(new ExtractJavaDocument(args.getJavaLexerType())), Schedulers.computation())
            
            //the observeOn is similar to the the subscribe method however it only affects subsequently chained operators
            //the Schedulers.io creates a new thread so it does not block the main thread import because we block on the next
            //chained operator
            .observeOn(Schedulers.io())
            
            //blocks until Observable terminates and then returns whatever
            .toBlockingObservable()
            
            //this takes the place of the onNext operator and deals with each object pushed through the pipe
            .forEach(new WriteJavaDocument(args.getOutputDir()));
    }
}
