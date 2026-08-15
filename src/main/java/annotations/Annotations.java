package annotations;

import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;

class SampleClass<T> {
    @SafeVarargs
    SampleClass(T ...args){
        for (T a : args){
            System.out.println(a);
        }
    }

    @Deprecated()
    void call(T a){
        System.out.println(a);
    }
}

// user defined annotation
@interface MyAnnotation{
    String name();
    String project() default "Tutorial-Builder";

}

/*
Bult-in Annotations are

Override
Deprecation

useful on user defined Annotations
Retention
Documented
Target
Inherited
Repeatable

*/

@MyAnnotation(name="Sid")
public class Annotations {

    final int i = 10;
    @SuppressWarnings("deprecation")
    public static void main(String[] args) {
        SampleClass<Integer> sc = new SampleClass<Integer>(1,2,3,4,5);
        sc.call(1);
//        System.out.println(i);
    }
}
