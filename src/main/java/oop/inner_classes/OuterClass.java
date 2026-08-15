package oop.inner_classes;

public class OuterClass {
    int outerWidth;
    int counter = 0;

    class NestedInnerClass{
        String specificParam;

        NestedInnerClass(){
            specificParam = "Special-sauce";
        }

        public void runNestedInnerFunction(){

            System.out.println("Nested Inner Class Called.");
            System.out.println("Outer Class Param" + outerWidth);
            runLocalInnerClassApproach();
            System.out.println(this);
            if(counter < 5)
                runOuterClassProcedure();
        }
    }

    public void runOuterClassProcedure(){
        System.out.println("Outer Class Call.");
        this.counter++;
        new NestedInnerClass().runNestedInnerFunction();
    }

    public void runLocalInnerClassApproach(){
        class LocalInnerClass{
            public void runLocalInnerFunction(){

                System.out.println("Local Inner Class Called.");
            }
        }

        new LocalInnerClass().runLocalInnerFunction();
    }
}
