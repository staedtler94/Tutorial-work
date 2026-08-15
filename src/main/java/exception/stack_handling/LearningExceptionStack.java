package exception.stack_handling;


public class LearningExceptionStack {

    int[] data;
    private final int DEFAULT_MAX = 5;
    private int top = -1;

    public LearningExceptionStack(){
        this.data = new int[DEFAULT_MAX];
    }

    public LearningExceptionStack(int suggestMax){
        this.data = new int[suggestMax];
    }

    public void push(int in) throws StackOverflowException {
        if(top == data.length -1){
            throw new StackOverflowException();
        }

        this.data[++this.top] = in;
    }

    public int pop() throws StackUnderflowException {
        if(top == -1){
            throw new StackUnderflowException();
        }

        int retVal = this.data[this.top];
        top--;
        return retVal;
    }
}
