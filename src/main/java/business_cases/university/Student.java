package business_cases.university;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Collections;

public class Student {
    String rollName;
    String name;
    Department dept;

    ArrayList<Subject> subjects;

    public Student(String rollName, String name, Department dept, Subject[] subjects) {
        this.rollName = rollName;
        this.name = name;
        this.dept = dept;
        this.setSubjects(subjects);
    }

    public Student(String rollName, String name, Department dept){
        this.rollName = rollName;
        this.name = name;
        this.dept = dept;
        this.subjects = new ArrayList<>();
    }

    public String getRollName() {
        return rollName;
    }

    public String getName() {
        return name;
    }

    public Department getDept() {
        return dept;
    }

    public Subject[] getSubjects() {
        return subjects.toArray(Subject[]::new);
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollName='" + rollName + '\'' +
                ", name='" + name + '\'' +
                ", dept=" + dept +
                ", subjects=" + subjects +
                '}';
    }

    public void setSubjects(Subject @NotNull ...subjects) {
        Collections.addAll(this.subjects, subjects);
    }

    public Subject addMarks(int marksObtained, int subjectId){
        try {
            this.subjects.get(subjectId).setMarksObtained(marksObtained);
            return this.subjects.get(subjectId);
        }catch (Exception e){
            System.out.println("error");
            return new Subject(0, "Null", 0);
        }
    }
}
