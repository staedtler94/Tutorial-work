package multi_threading.producer_consumer.teacher_students_example;

public class ClassroomExercise {

    public static void main(String[] args) {
        Whiteboard wt = Whiteboard.getWhiteBoardInstance();

        Student student1 = new Student(wt);
        Student student2 = new Student(wt);
        Student student3 = new Student(wt);
        Student student4 = new Student(wt);
        Teacher teacher = new Teacher(wt);

        teacher.start();
        student1.start();
        student2.start();
        student3.start();
        student4.start();


    }
}
