package math;

public class TriangleAreaCalculator {

    public float calculate(float base, float height){
        float area;
        area = base * height / 2;
        return area;
    }

    public double calculate(float side1, float side2, float side3){
        float semiPerimeter = (side1+ side2 + side3)/2;
        double area = Math.sqrt(semiPerimeter * (semiPerimeter - side1) * (semiPerimeter - side2) * (semiPerimeter - side3) );
        return area;
    }
}
