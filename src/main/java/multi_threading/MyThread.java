package multi_threading;

import java.util.Date;

public class MyThread extends Thread{

    public MyThread(){}
    public MyThread(String name){
        super (name);
    }

    public void run(){
        int i =0;

        while(i < 1000){
            System.out.println("Thread Flow executed " + i + " at time " + new Date().getTime());
            i++;
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
