package exception;

class NegativeDimensionException extends Exception {
    public String toString(){
        return "Dimensions cannot be Negative";
    }
}

public class ExceptionLearning {

    public void learningExceptionHandling(){
        try{
//            int d = 10 / 0;
//            int area = area(-10, 0);
//            System.out.println(area);
            understandingFinalBlock();
        } catch (Exception e) {
            System.out.printf(e.toString());
        }
    }

    public int area(int l, int b) throws NegativeDimensionException {
        if(l < 0 || b < 0 )
            throw new NegativeDimensionException();

        return l * b;
    }

    public void understandingFinalBlock() throws Exception {

        // some logic to do things but can throw errors
        try {
            throw new NegativeDimensionException();
        } catch (Exception e) { // this is base class so will also catch all exceptions
            System.out.println("Exception caught");
            throw new RuntimeException(e);
        }
        finally {
            System.out.println("Finally Block execution.");
            System.out.println("But before exiting this function you need to clean the variables or disconnect connections hence use the finally block.");
            System.out.println("It can be used if we are not catching any exceptions or catching few exceptions");
            System.out.println("If you are sure you have caught all exceptions you don't need finally block.");
        }
    }
}
