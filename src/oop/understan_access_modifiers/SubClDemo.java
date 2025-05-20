package oop.understan_access_modifiers;

public class SubClDemo extends BaseDemo {
    int x = 500;
    SubClDemo(){
        super.x = 100;
        super.info = "Sub class Demo Information";
    }

    protected void displayDetails(String val){
        System.out.println("Sub CLass Demo Display method - " + val);
    }

    void show(){
        displayDetails("Calling from inside Subclass");
        System.out.println("Printing default variable from Parent class " + super.x);
        System.out.println("Printing default variable from class " + x);
//        System.out.println("Printing Protected variable from class " + y);
        System.out.println("Printing private variable from class " + z);
        System.out.println("Printing public variable from class " + a);
    }


}
