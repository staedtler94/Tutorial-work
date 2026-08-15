package multi_threading.producer_consumer;

public class ProducerConsumerRunner {
    public static void main(String[] args) {
        SharedData data = new SharedData();
        Producer producer = new Producer(data);
        Consumer consumer = new Consumer(data);

        producer.start();
        consumer.start();
    }
}
