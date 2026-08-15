package multi_threading.producer_consumer;

public class SharedData {
    synchronized int getData() {
        while(writingData){
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
        int x = data;
        writingData = true;
        notify();
        return x;
    }

    synchronized void setData(int data) {
        while (!writingData){
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }

        this.data = data;
        writingData = false;
        notify();
    }

    private int data;
    private boolean writingData = true;
}
