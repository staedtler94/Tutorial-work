package multi_threading;

import org.jetbrains.annotations.NotNull;

public class SharedResourceExample {

    public void display(@NotNull String s) throws InterruptedException {
        for(int i = 0; i < s.length(); i++){
            System.out.print(s.charAt(i));
        }

        System.out.println("Finished...");
    }

    synchronized void display(@NotNull String s, @NotNull int threadId) throws InterruptedException {

        // this function becomes a critical section
        for(int i = 0; i < s.length(); i++){
            System.out.print(s.charAt(i));
        }

        System.out.println("Thread Number: " + threadId + " Finished the critical section...");
    }
}
