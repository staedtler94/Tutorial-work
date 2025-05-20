package oop.understan_access_modifiers;

public class DemoRunner {
    DemoRunner() {

    }

    public static void main(String[] args) {
        BaseDemo bd = new BaseDemo();
        bd.displayDetails("Seriously ");
        bd.displayDetails("Seriously ", 100);

        SubClDemo sl = new SubClDemo();
        sl.show();

    }

}
