package exception.stack_handling;

public class StackOverflowException extends Exception{

    @Override
    public String toString() {
        return "Stack will overflow";
    }
}
