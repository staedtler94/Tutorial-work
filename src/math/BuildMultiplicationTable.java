package math;

public class BuildMultiplicationTable {
    public void multiplicationTableBuilder(int number, int upperLimit) {
        this.multiplicationTableBuilder(number, upperLimit, 1);
    }

    public void multiplicationTableBuilder(int number, int upperLimit, int lowerLimit){

        for (int i = lowerLimit; i <= upperLimit; i++){
            System.out.println(number + " x " + i + " = " + i*number);
        }

    }
}
