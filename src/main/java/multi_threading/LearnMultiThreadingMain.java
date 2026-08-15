package multi_threading;

import java.util.Date;

public class LearnMultiThreadingMain {
    public static void main(String[] args) {

//      LearnMultiThreadingMain.multiThreadingLesson1();
        SharedResourceExample sre = new SharedResourceExample();
        ThreadUseSharedData thread1 = new ThreadUseSharedData(sre, "Hello World.");
        ThreadUseSharedData thread2 = new ThreadUseSharedData(sre, "Welcome");
        AnotherThreadUsingSharedResource thread3 = new AnotherThreadUsingSharedResource(sre, "Some Another thread on Same Resource...");

        thread1.start();
        thread3.start();
        thread2.start();

    }

    public static void multiThreadingLesson1(){
        MyThread t1 = new MyThread();
        t1.setDaemon(true); // daemon thread becomes a background thread and finishes when other threads are finished
        t1.start();

        MyRunnableSample rs = new MyRunnableSample();
        Thread t2 = new Thread(rs);
        t2.start();

        int j = 0;
        while (j < 1000){
            System.out.println("Main Control Flow being executed " + j + " at time " + new Date().getTime());
            j++;
            Thread.yield(); // gives more time to other threads.
        }

        MyThread detailedThread = new MyThread("Sample-thread");
        System.out.println("Id " + detailedThread.threadId());
        System.out.println("Name " + detailedThread.getName());
        System.out.println("Priority " + detailedThread.getPriority());
        System.out.println("State " + detailedThread.getState());

        t1.interrupt();

        Thread mainThread = Thread.currentThread(); // gives the current thread
        try {
            mainThread.join(); // joins any thread that is still executing. Doesn't close the application. Waits event for the Daemon thread.
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Program End...");
    }
}
