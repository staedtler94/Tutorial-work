package math;

public class MatrixAssistant {
    public void printMatrix(int[][] firstMatrix){
        for (int[] arr: firstMatrix) {
            for(int e: arr){
                System.out.print(e);
            }
            System.out.println("");
        }
    }

    public int[] buildMatrixRow(int ...elements){
        return elements;
    }
}
