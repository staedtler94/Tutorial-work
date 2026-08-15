package streams_tutorial;

import java.util.ArrayList;

public class DataRecord {
    private float[][] dataHolder;

    DataRecord(){}
    DataRecord(int rows, int cols){
        this.loadData(rows, cols);
    }

    protected boolean loadData(int row, int colm){

        try {
            dataHolder = new float[row][colm];
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < colm; j++) {
                    dataHolder[i][j] = (float) Math.random();
                }
            }
        } catch (Exception e) {
            System.out.println(e);
            return false;
        }

        return true;
    }

    public float[] getDataByRows(int rowId){
        return dataHolder[rowId];
    }
}
