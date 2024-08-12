package math;

public class GCD {

    private final int MAX_ITERATIONS = 1000000;

    /**
     * Find GCD of positive numbers
     * @param n1 int 1
     * @param n2 int 2
     * @return gcd int returned
     */
    public int findGCD(int n1, int n2){
        int counter = 0;
        while(n1 != n2){

            if(counter > this.MAX_ITERATIONS){
                n1 = -1;
                System.out.println("Increase the Max Iteration to scale to higher numbers support");
                break;
            }

            if(n1 > n2){
                n1 = n1 - n2;
            } else {
                n2 = n2-n1;
            }

            counter++;
        }

        return n1;
    }

}
