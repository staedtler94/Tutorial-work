package exception;


import exception.stack_handling.LearningExceptionStack;
import exception.stack_handling.StackOverflowException;
import exception.stack_handling.StackUnderflowException;

public class ExceptionLearningMain {
    public static void main(String[] args) {
        System.out.println(System.getProperty("user.dir"));

        ExceptionLearningMain lm = new ExceptionLearningMain();
        lm.learningTryResoruces();

        lm.stackExceptionHandling();
    }
    public void stackExceptionHandling() {
        try {
            LearningExceptionStack lm = new LearningExceptionStack();
//            lm.pop();
            lm.push(10);
            lm.push(10);

            lm.push(10);
            lm.push(10);

            lm.push(10);
            lm.push(10);
        } catch (StackOverflowException e) {
            System.out.println(e);
        }
//        catch (StackUnderflowException e) {
//            System.out.println(e);
//        }
    }
    public void learningTryResoruces(){
        new TryWithResourcesDemo().executeLearning();
    }
}
