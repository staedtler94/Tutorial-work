package math;

import java.util.ArrayList;
import java.util.List;

public class Series {
    public List<Integer> buildArithmeticSeries(int initialTerm, int commonDiff, int terms, boolean printIt){
        List<Integer> retList = new ArrayList<Integer>();

        for (int i =0; i <= terms; i++){
            int el = initialTerm + i*commonDiff;
            retList.add(el);
            if(printIt){
                System.out.println(el);
            }
        }

        return retList;
    }

    public List<Integer> buildGeometricSeries(int initialTerm, int commonRatio, int terms, boolean printIt){

        List<Integer> retList = new ArrayList<Integer>();
        int carry = initialTerm;

        retList.add(carry);
        if (printIt){
            System.out.println(carry);
        }

        int counter = 1;
        do{
            carry = carry*commonRatio;


            retList.add(carry);

            if (printIt){
                System.out.println(carry);
            }

            counter++;
        }while(counter <= terms);

        return retList;
    }

    public List<Integer> buildFibonacciSeries(int terms, boolean printIt){
        int first = 0, second = 1, counter = 0;

        System.out.print(first + ", ");
        System.out.print(second + ", ");

        List<Integer> retList = new ArrayList<Integer>();
        retList.add(first);
        retList.add(second);

        while(counter < terms){
            int next = first + second;
            first = second;
            second = next;

            retList.add(next);
            System.out.print(second + ", ");
            counter++;
        }

        return retList;
    }
}
