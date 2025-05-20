import algos.ArrayRelatedAlgosSimple;
import algos.DigitsRelatedAlgos;
import business_cases.university.UniversityClassPickerExample;
import general.LeapYearChecker;
import general.Patterns;
import general.RadixFinder;
import general.WebsiteRecogniser;
import math.*;
import oop.inner_classes.OuterClass;

import java.util.Scanner;

public class TutorialWork {

    private enum Triangle_Area {
        BASE_HEIGHT,
        ALL_SIDES
    }

    public void runTutorialWork(){
        new OuterClass().runOuterClassProcedure();
    }

    private void universityPickerExample(){
        UniversityClassPickerExample uniPickerExample = new UniversityClassPickerExample();
        uniPickerExample.universityPickerExample();
    }

    private void findGCD(){
        GCD gd = new GCD();

        System.out.println(gd.findGCD(35, 21));
        System.out.println(gd.findGCD(25, 15));
        System.out.println(gd.findGCD(102, 30));
        System.out.println(gd.findGCD(45, 117));
    }

    private void primeNumbers(){
        PrimeNumber pm = new PrimeNumber();
        System.out.println(pm.isNumberPrime(13));
        System.out.println(pm.isNumberPrime(20));
        System.out.println(pm.isNumberPrime(5));
        System.out.println(pm.isNumberPrime(17));
        System.out.println(pm.isNumberPrime(193));
    }

    private void matrixCalculations(){
        MatrixAssistant matAsst = new MatrixAssistant();
        int[][] firstMat = new int[3][];
        firstMat[0] = matAsst.buildMatrixRow(1,2,3,4,5);
        firstMat[1] = matAsst.buildMatrixRow(6,7,8,9,10);
        firstMat[2] = matAsst.buildMatrixRow(11,12,13,14,15);

        int[][] secondMat = new int[3][];
        secondMat[0] = matAsst.buildMatrixRow(15,14,13,12,11);
        secondMat[1] = matAsst.buildMatrixRow(10,9,8,7,6);
        secondMat[2] = matAsst.buildMatrixRow(5,4,3,2,1);

        MatrixCalculator mc =  new MatrixCalculator();
        int[][] addedMatrix = mc.addMatrix(firstMat,secondMat);

        int[][] multMat1 = new int[3][];
        multMat1[0] = matAsst.buildMatrixRow(1,2,3);
        multMat1[1] = matAsst.buildMatrixRow(6,7,8);
        multMat1[2] = matAsst.buildMatrixRow(11,12,13);

        int[][] multMat2 = new int[3][];
        multMat2[0] = matAsst.buildMatrixRow(15,14,13,12);
        multMat2[1] = matAsst.buildMatrixRow(10,9,8,7);
        multMat2[2] = matAsst.buildMatrixRow(5,4,3,2);

//        int[][] identifyMatrix

        int[][] multMat = mc.multiplyMatrix(multMat1,multMat2);
    }

    private void simpleArrayAlgo(){
        ArrayRelatedAlgosSimple arrAlg = new ArrayRelatedAlgosSimple();
        int[] arr = {0,10,1,13, 30,29,50,123,9,2,3,4,5,7,1};
        System.out.println(arrAlg.findSecondHighestElement(arr));
        arrAlg.rotateArrayLeftSide(arr);
        arrAlg.rotateArrayRightSide(arr);
    }

    private void patternPrinter(){
        Patterns pt = new Patterns();
        pt.printStarPattern_ChristmasTree(3);
    }

    private void seriesBuilder(){
        Series seriesBuilder = new Series();
        seriesBuilder.buildArithmeticSeries(2, 3, 10, true);
        seriesBuilder.buildGeometricSeries(2, 3, 10, true);
        seriesBuilder.buildFibonacciSeries(10, true);

    }

    private void printDigitsOfNumber(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Integer Number");
        int n = sc.nextInt();

        DigitsRelatedAlgos gd = new DigitsRelatedAlgos();
        gd.printDigitsOfNumber(n);

        gd.countDigitsOfNumber(43314324);

        boolean armStrong = gd.isArmstrongNumber(n);
        System.out.println("Is Armstrong number: " + n + "  " + armStrong);

        gd.reverseTheNumber(n);

        boolean palindrome = gd.isPalindrome(n);
        System.out.println(palindrome);

        gd.printDigitsInWord(300400);
    }

    private void buildAMultiplicationTable(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Input number for multiplication table: ");
        int number = sc.nextInt();

        System.out.println("Input Upper-limit to enter: ");
        int upperLimit = sc.nextInt();

        System.out.println("Lower-limit is defaulted to 1");

        BuildMultiplicationTable tabular = new BuildMultiplicationTable();
        tabular.multiplicationTableBuilder(number, upperLimit);
    }

    private void websiteClassifier(){
        String str = "https://www.google.com";
        WebsiteRecogniser webReg = new WebsiteRecogniser();
        String output = webReg.getProtocol(str);
        System.out.println(output);

        String outExt = webReg.getExtension(str);
        System.out.println(outExt);
    }

    private void checkLeapYear(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number it can be in any Radix format");
        int input = sc.nextInt();

        LeapYearChecker lc = new LeapYearChecker();
        if(lc.checkYear(input)){
            System.out.println("Is Leap year.");
        } else {
            System.out.println("Is not a leap year.");
        }
    }

    private void checkRadix(){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number it can be in any Radix format");
        String input = sc.nextLine();

        RadixFinder radixFinder = new RadixFinder();

//        String str = "0101010111101232456789";

        if(radixFinder.isBinary(input)){
            System.out.println("Is binary");
        } else if(radixFinder.isOctal(input)){
            System.out.println("Is Octal");
        } else if(radixFinder.isDecimal(input)){
            System.out.println("Is Decimal");
        } else if(radixFinder.isHexaDecimal(input)){
            System.out.println("Is Hexa-Decimal");
        } else {
            System.out.println("Is invalid Number Radix");
        }
    }

    private void bitwiseOperators(){
        int x = 0b01100;
        int y = 0b00110;

        int andOperator = x & y;
        int orOperator = x | y;
        int xorOperator = x ^ y;

        int leftShift = x<<1; // multiples into fractions of 2, 2 raise to number of bits to shift left
        int rightShift = x>>1; // half the number 1/2 fraction multiples

        int neg = -0b01100;
        int unsignedShift = neg>>>1; // some very big number
        int notOperator = ~x; // it becomes negative but adds one so 12 becomes -13.
        int addOperator = x + y;

        System.out.println(x + " " + y);
        System.out.println(andOperator);
        System.out.println(orOperator);

        System.out.println(xorOperator);
        System.out.println(leftShift);
        System.out.println(rightShift);

        System.out.println(unsignedShift);
        System.out.println(notOperator);

        System.out.println(addOperator);
    }

    private void calculateRoots(){
        Scanner sc = new Scanner(System.in);

        int a,b,c;
        a= sc.nextInt();
        b= sc.nextInt();
        c= sc.nextInt();

        QuadraticEquation qE = new QuadraticEquation();
        double[] root = qE.calculateRoots(a,b,c);

        System.out.println("Roots are: "+ root[0] + root[1]);
    }

    private void triangleCalculator(){
        System.out.println("Hello World, I am your Triangle Area Calculator Collin :wave");

        Scanner sc = new Scanner(System.in);
        System.out.println("How will like to calculate the area Option 1" +
                " with base and height or /n Option 2 " +
                "With Sides of triangle /n Pick 1 or 2");

        int option = sc.nextInt();

        TriangleAreaCalculator triangleAreaCalculator = new TriangleAreaCalculator();

        if(option == 1){
            float base, height, area;
            System.out.println("Please Entry the Base of the triangle: ");
            base = sc.nextFloat();

            System.out.println("Please Entry the Height of the triangle: ");
            height = sc.nextFloat();

            area = triangleAreaCalculator.calculate(base, height);
            System.out.println("Here is the area of the triangle: "+ area);
        } else if(option == 2){

            float side1, side2, side3;
            double area;
            System.out.println("Please Entry the Side 1 of the triangle: ");
            side1 = sc.nextFloat();
            System.out.println("Please Entry the Side 2 of the triangle: ");
            side2 = sc.nextFloat();
            System.out.println("Please Entry the Side 3 of the triangle: ");
            side3 = sc.nextFloat();

            area = triangleAreaCalculator.calculate(side1, side2, side3);
            System.out.println("Here is the area of the triangle: "+ area);
        }

        System.out.println("Program Completed.");
    }
}
