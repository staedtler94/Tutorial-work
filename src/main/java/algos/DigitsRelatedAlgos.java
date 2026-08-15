package algos;

import java.util.ArrayList;
import java.util.List;

public class DigitsRelatedAlgos {
    public void printDigitsOfNumber(int n){

        int quotient = n;
        while(quotient != 0){

            int currentLastDigit = quotient % 10;
            System.out.println(currentLastDigit);

            quotient = quotient / 10;
        }
    }

    public void countDigitsOfNumber(int n){
        int quotient = n;
        int counter = 0;
        while(quotient != 0){

            counter++;

            quotient = quotient / 10;
        }

        System.out.println(counter);
    }

    public boolean isArmstrongNumber(int n){

        List<Integer> collectionList = this.getDigitsOfNumber(n);
        int sum = 0;
        for (int i : collectionList){
            sum += i*i*i;
        }

        return sum == n;
    }

    public int reverseTheNumber(int n){

        int quotient = n, rev = 0;

        while(quotient != 0){

            int r = quotient % 10;
            rev = rev * 10 + r;
            quotient = quotient / 10;
        }

        System.out.println(rev);
        return rev;
    }

    public String reverseTheNumberToString(int n){

        int quotient = n;
        String retStr = "";

        while(quotient != 0){
            int reminder = quotient % 10;
            quotient = quotient / 10;

            retStr = retStr.concat("" + reminder);
        }

        System.out.println(retStr);
        return  retStr;
    }
    public boolean isPalindrome(int n){
        int reverse = this.reverseTheNumber(n);

        return n == reverse;
    }

    public void printDigitsInWord(int n){

        String str = this.reverseTheNumberToString(n);
        for (int i = str.length() - 1; i >= 0; i--){
            char currChar = str.charAt(i);
            this.printDigits(currChar);
        }
    }

    private void printDigits(char c){
        switch (c){
            case '0':
                System.out.println("Zero");
                return;
            case '1':
                System.out.println("One");
                return;
            case '2':
                System.out.println("Two");
                return;
            case '3':
                System.out.println("Three");
                return;
            case '4':
                System.out.println("Four");
                return;
            case '5':
                System.out.println("Five");
                return;
            case '6':
                System.out.println("Siz");
                return;
            case '7':
                System.out.println("Seven");
                return;
            case '8':
                System.out.println("Eight");
                return;
            case '9':
                System.out.println("Nine");
                return;
            default:
                System.out.println("Nan");
        }
    }
    private List<Integer> getDigitsOfNumber(int n){
        List<Integer> collectionList = new ArrayList<Integer>();

        int quotient = n;
        while(quotient != 0){

            int currentLastDigit = quotient % 10;
            collectionList.add(currentLastDigit);

            quotient = quotient / 10;
        }

        return collectionList;
    }
}
