package multi_threading;

import java.util.Date;

public class MyRunnableSample implements Runnable{
    @Override
    public void run() {

        int r = 0;
        while(r < 1000){
            System.out.println("Runnable Flow executed " + r + " at time " + new Date().getTime());
            r++;
        }
    }
}
