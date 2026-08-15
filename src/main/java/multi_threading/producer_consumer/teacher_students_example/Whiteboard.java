package multi_threading.producer_consumer.teacher_students_example;

import java.util.ArrayList;
import java.util.UUID;

public class Whiteboard {

    private static Whiteboard singleInstance;

    static public Whiteboard getWhiteBoardInstance(){
        if(singleInstance == null){
            singleInstance = new Whiteboard();
        }
        return singleInstance;
    }

    String text;
    private final ArrayList<UUID> registerStudents = new ArrayList<UUID>();
    private ArrayList<UUID> contentRead = new ArrayList<UUID>();

    synchronized public void registerStudents(UUID s){
        registerStudents.add(s);
    }

    synchronized public void writeOnBoard(String text){
        System.out.println(readyForNextContentWrite());
        while (!readyForNextContentWrite()) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
        this.text = text;
        this.contentRead = new ArrayList<UUID>(registerStudents);
        System.out.println("Whiteboard has content " + text);
        notify();
    }

    synchronized public String copyDataFromBoard(UUID studentID){
        while(readyForNextContentWrite()){
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }

        String x = text;
        contentRead.remove(studentID);
        notify();
        return x;
    }

    synchronized public boolean readyForNextContentWrite(){
        return contentRead.isEmpty();
    }

    private boolean contentFinished = false;

    synchronized public boolean isContentFinished() {
        return contentFinished;
    }

    synchronized public void setContentFinished(boolean contentFinished) {
        this.contentFinished = contentFinished;
    }
}
