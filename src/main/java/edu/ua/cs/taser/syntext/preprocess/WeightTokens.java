package edu.ua.cs.taser.syntext.preprocess;

import edu.ua.cs.taser.syntext.SyntaxAnnotatedCorpus;
import edu.ua.cs.taser.syntext.SyntaxAnnotatedDocument;
import edu.ua.cs.taser.syntext.SyntaxAnnotatedToken;
import edu.ua.cs.taser.token.TokenStream;
import edu.ua.cs.taser.token.TokenType;
import java.io.*;	//added by jz
import java.util.*;

import rx.util.functions.Func1;

public class WeightTokens implements Func1<SyntaxAnnotatedDocument, SyntaxAnnotatedDocument> {

    private Hashtable<String, Integer> key_weights;	//added by jz
    
    //added second parameter so weightFile can be identified
    public WeightTokens(final SyntaxAnnotatedCorpus syncorp, final String weightFile) {
        
        //the following block was added by jz
        this.key_weights = new Hashtable<String, Integer>();	
		String line = null;
		FileReader fr = null;
		BufferedReader br = null;
		
		try{
			 fr = new FileReader(weightFile);
			 br = new BufferedReader(fr);
			
			while((line = br.readLine())!= null){
				
				String[] split = line.split(" ");
				this.key_weights.put(split[0], Integer.parseInt(split[1]));
			}
		
		} catch(IOException e){
			e.printStackTrace();
		  }finally{
			try{
				
				if(br != null)
					br.close();
				if(fr != null)
					fr.close();
				
			}catch(IOException ex){
				ex.printStackTrace();
			}
		  
		  
		  }
		  
		//here ends the block by jz						

		syncorp.addTransformation("WeightTokens");
    }

    public SyntaxAnnotatedDocument call(SyntaxAnnotatedDocument syndoc) {
        final TokenStream<SyntaxAnnotatedToken> stream = new TokenStream<SyntaxAnnotatedToken>(syndoc.getTokens());
        while (stream.hasNext()) {
            final SyntaxAnnotatedToken token = stream.getNext();
            final TokenType ttype = token.getType();
            //Number weight = token.getWeight();
            
            int value;
            
            //must provide a default weight of one if nothing specified in the weight file
            if(this.key_weights.containsKey(ttype.toString()))
				value = this.key_weights.get(ttype.toString());
			else
				value = 1;
				
            //cast the int value to a Number obj for some reason
            Integer intObj = new Integer(value);
            Number numObj = (Number)intObj;
            
            /** WE NEED TO GET RIGHT IN HERE TO DO THE WEIGHT UPDATING
            
            if (ttype.isA(TokenType.METHOD_NAME)) {
                weight = 1;
            } else if (ttype.isA(TokenType.PARAMETER_NAME)) {
                weight = 1.0;
            }
            
            ALL OF THE ABOVE BUSINESS MAYBE USE A DICTIONARY OR SOMETHING **/
            token.setWeight(numObj);
        }
        return syndoc;
    }
}
