package math;

public class PrimeNumber {
    public boolean isNumberPrime(int num){

        for(int i=2; i <= num /2; i++){
            if((num % i) == 0)
                return false;
        }
        return true;
    }
}
