package oop.understan_access_modifiers;

public class BaseDemo {
      int x; // this is default access modifier
      private int y = 20;
      protected int z = 50;
      public int a = 100;
      protected String info;

     BaseDemo(){
         x = 10;
         info = "Base Demo Information";
     }

     protected void displayDetails(String val){
         System.out.println(val + "Base Demo Display");
     }

    protected void displayDetails(String val, int x){
        System.out.println(val + "Base Demo Display" + x);
    }

    public void dispay(){
         this.displayDetails("Hello");
         this.displayDetails("Again Hola!", 2);
    }

}
