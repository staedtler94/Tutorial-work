package multi_threading.producer_consumer.teacher_students_example;

import lombok.Getter;

import java.util.UUID;

import static java.util.UUID.randomUUID;

public class Student extends Thread{
    Whiteboard wt;
    @Getter
    private final UUID studentId;

    public Student(Whiteboard wt){
        this.wt = wt;
        this.studentId = randomUUID();
        wt.registerStudents(studentId);
    }

    @Override
    public void run() {

        while(!wt.isContentFinished()){
            String text = wt.copyDataFromBoard(studentId);
            System.out.println("Student " + studentId + " has read it: " + text);
        }
    }

}
