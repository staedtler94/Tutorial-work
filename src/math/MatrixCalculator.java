package math;


public class MatrixCalculator {
    public MatrixCalculator(){
    }

    MatrixCalculator(boolean print){}

    public int[][] addMatrix(int[][] firstMatrix, int[][] secondMatrix){
        // assume symmetric matrix and a staggered matrix
        if(firstMatrix.length != secondMatrix.length || firstMatrix[0].length != secondMatrix[0].length ){
            return new int[0][];
        }

        int[][] thirdMatrix = new int[firstMatrix.length][firstMatrix[0].length];
        for (int i=0; i < firstMatrix.length; i++){
            for (int j =0; j < firstMatrix[0].length; j++){
                thirdMatrix[i][j] = firstMatrix[i][j] + secondMatrix[i][j];
            }
        }

        return thirdMatrix;
    }

    public int[][] multiplyMatrix(int[][] firstMatrix, int[][] secondMatrix){
        if(firstMatrix[0].length != secondMatrix.length){
            return new int[0][];
        }

        int l11 = firstMatrix.length, l12 = firstMatrix[0].length, l21 = secondMatrix.length, l22 = secondMatrix[0].length;
        int[][] retMat = new int[l11][l22];

        for(int x1 = 0; x1 < l11; x1++){

            for(int y2 = 0; y2 < l22; y2++){
                int sum =0;
                for (int x2 = 0; x2 < l12; x2++) {
                    int temp = firstMatrix[x1][x2] * secondMatrix[x2][y2];
                    System.out.println(firstMatrix[x1][x2] + " x " + secondMatrix[x2][y2] + " = " + temp);
                    sum+=temp;
                }
                retMat[x1][y2] = sum;
            }
        }
        return retMat;
    }
}
//
//x
//1,2,3
//4,5,6
//7,8,9
//10,11,12
//
//y
//2,3,4,5,5
//3,4,5,5,5
//5,6,7,5,5
//
//z 4 x 5
//
//z11 = x11 * y11 + x12 * y21 +x13 * y31
//z12 = x11 * y12 + x12*y22 + x13 * y32
//1*2 + 2*3 + 3*5
