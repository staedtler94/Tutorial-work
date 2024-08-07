package math;

public class QuadraticEquation {

    public double[] calculateRoots(int a, int b, int c){
        double root[] = new double[2];

        float v = b * b - (4 * a * c);
        root[0] = (-b + Math.sqrt(v)) / (2*a);
        root[1] = (-b - Math.sqrt(v)) / (2*a);

        return root;
    }
}
