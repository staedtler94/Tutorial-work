package multi_threading.producer_consumer;

public class Producer extends Thread{
    private final SharedData data;

    public Producer(SharedData data){
        this.data = data;
    }

    public void run(){
        int counter = 0;
        while(counter < 100000000){
            data.setData(counter);
            System.out.println("Producer Producing data: " + counter);
            counter++;
        }
    }
}
