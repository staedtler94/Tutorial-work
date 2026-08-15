package exception.stack_handling;

public class StackUnderflowException extends Exception {

    @Override
    public String toString() {
        return "Error: Stack is empty";
    }
}
