package edu.ua.cs.taser.util.function;

import rx.Observable;
import rx.util.functions.Func1;

//allows for passing of a function and observable to allow for functions that do not normally exsist in the observable library
public final class Functors {

	//the generic type T is the input type, while the generic type R is the Output type
    public static <T, R> Func1<Observable<T>, Observable<R>> map(final Func1<T, R> f) {
        return new Func1<Observable<T>, Observable<R>>() {
           
			//the function f passed by the call is the function used by map call comes from the load file content
            @Override
            public Observable<R> call(Observable<T> t) {
                return t.map(f);
            }
        };
    }

    private Functors() {}
}
