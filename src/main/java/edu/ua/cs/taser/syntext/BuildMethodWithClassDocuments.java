
package edu.ua.cs.taser.syntext;

import edu.ua.cs.taser.document.JavaEntity;
import edu.ua.cs.taser.javatext.JavaDocument;
// import edu.ua.cs.taser.javatext.JavaEntity;
import edu.ua.cs.taser.token.JavaToken;

import rx.util.functions.Func1;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.LinkedHashMap;

public class BuildMethodWithClassDocuments implements Func1<JavaDocument, List<SyntaxAnnotatedDocument>> {
    
    public List<SyntaxAnnotatedDocument> call(JavaDocument jdoc) {
        Map<String, SyntaxAnnotatedDocument> syndocMap = new HashMap<String, SyntaxAnnotatedDocument>();
        List<SyntaxAnnotatedDocument> syndocs = new LinkedList<SyntaxAnnotatedDocument>();
        //List<SyntaxAnnotatedToken> tokenList = new LinkedList<SyntaxAnnotatedToken>();	//added by JZ
        Map<String, LinkedList<SyntaxAnnotatedToken>> classTokens = new LinkedHashMap<String, LinkedList<SyntaxAnnotatedToken>>(); //added by JZ
        
         /*****************************************************************************
         * 
         *	CLASS_TYPE ENTITIES DO NOT NEED TO BE PASSED INTO THE addToken METHOD ONLY
         * 	ENTITIES OF THE METHOD TYPE NEED BE PASSED HOWEVER WE STILL NEED INFORMATION
         * 	FROM THE CLASS_TYPE ENTITIES I PROPOSE STORING THE CLASS INFORMATION AND THEN 
         * 	ADDING AS NECESSARY TO METHOD ENTITIES CONSIDERATION SHOULD BE MAKE TO ENSURE
         * 	INFORMATION BETWEEN CLASS AND METHOD IS PAIRED CORRECTLY
         * 
         *****************************************************************************/ 
        
        for (JavaToken t : jdoc.getTokens()) 
        {
            
            JavaEntity e = t.getEntity();
            
            if (e.getType().isClassType())
				storeClassToken(e, t, classTokens);
			
            else if(e.getType().isMethod()) 
                 addToken(e, t, syndocMap, syndocs);				
            
            else
            {
                e = e.getParent();
                
                while ((e != null) && ((!e.getType().isClassType()) && (!e.getType().isMethod()))) 
					e = e.getParent();
             
                if (e != null) 
                    addToken(e, t, syndocMap, syndocs);
            }
        }
        
        addClassTokens(syndocMap, classTokens);
        return syndocs;
    }
	
	 
    private static void addToken(JavaEntity e, JavaToken t, Map<String, SyntaxAnnotatedDocument> syndocMap, List<SyntaxAnnotatedDocument> syndocs) {
        String name = e.getName();
        
        //creates a new syndoc if needed
        if (!syndocMap.containsKey(name)) {
            SyntaxAnnotatedDocument d = new SyntaxAnnotatedDocument(e.getType(), name);
            syndocMap.put(name, d);
            syndocs.add(d);
        }
        
        //adds a token to the syndoc 
        syndocMap.get(name).getTokens().add(new SyntaxAnnotatedToken(t));
    }
    
    //Stores class tokens in a mapped list sorted by name
    private static void storeClassToken(JavaEntity e, JavaToken t, Map<String, LinkedList<SyntaxAnnotatedToken>> classTokens){
		String name = e.getName();
		
		if(!classTokens.containsKey(name))
			classTokens.put(name, new LinkedList<SyntaxAnnotatedToken>());
		
		classTokens.get(name).add(new SyntaxAnnotatedToken(t));
	}
	
	//Adds all stored outer class tokens to the method documents
	private static void addClassTokens(Map<String, SyntaxAnnotatedDocument> syndocMap, Map<String, LinkedList<SyntaxAnnotatedToken>> classTokens){
		
		LinkedList tokens = classTokens.entrySet().iterator().next().getValue();
		
		for(SyntaxAnnotatedDocument doc : syndocMap.values())
			doc.getTokens().addAll(tokens);
		
	}
}
