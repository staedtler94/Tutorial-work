package multi_threading;

public class AnotherThreadUsingSharedResource extends Thread {

        SharedResourceExample sr;
        String input;
    AnotherThreadUsingSharedResource(SharedResourceExample sr, String s){
            this.sr = sr;
            input = s;
        }
        @Override
        public void run() {
            try {
                sr.display("Something else is being printed....");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
