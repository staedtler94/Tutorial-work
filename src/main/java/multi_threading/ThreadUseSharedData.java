package multi_threading;

public class ThreadUseSharedData extends Thread{

    SharedResourceExample sr;
    String input;
    ThreadUseSharedData(SharedResourceExample sr, String s){
        this.sr = sr;
        input = s;
    }
    @Override
    public void run() {
        try {
//            sr.display(input);
            sr.display(input, (int) Math.round(Math.random()*1000));
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

