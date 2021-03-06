package edu.ua.cs.taser.util.function;

import rx.Observable;
import rx.util.functions.Func1;

public final class Operators {
	//flatten turns a list of lists into a single list
    public static <T> Observable<T> flatten(Observable<? extends Iterable<? extends T>> source) {
        return source.flatMap(new Func1<Iterable<? extends T>, Observable<T>>() {
            @Override
            public Observable<T> call(Iterable<? extends T> t1) {
                return Observable.from(t1);
            }
        });
    }

    private Operators() {}
}
