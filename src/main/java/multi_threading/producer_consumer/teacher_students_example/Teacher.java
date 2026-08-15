package multi_threading.producer_consumer.teacher_students_example;

public class Teacher extends Thread {

    private final Whiteboard wt;
    String[] content = {
            "Welcome to class",
            "this is Java tutorials",
            "Thanks for joining"
    };

    public Teacher(Whiteboard wt) {
        this.wt = wt;
    }

    @Override
    public void run() {

        for (String s : content) {
            wt.writeOnBoard(s);
            System.out.println("Content written on board by teacher: " + s);
        }
        wt.setContentFinished(true);
    }
}
