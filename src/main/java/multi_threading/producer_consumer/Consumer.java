package multi_threading.producer_consumer;

public class Consumer extends Thread {
    private final SharedData data;

    public Consumer(SharedData data) {
        this.data = data;
    }

    public void run() {

        int c= 0;
        while(c < 1000000){
            int x = data.getData();
            System.out.println("Consumer Data is: " + x);
            c++;
        }

    }
}

