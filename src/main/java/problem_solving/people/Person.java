package problem_solving.people;

public class Person {

    public String getName() {
        return name;
    }

    private String name;

    public int getAge() {
        return age;
    }

    private int age;

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }
}
