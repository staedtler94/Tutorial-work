package algos;

public class ArrayRelatedAlgosSimple {
    public int findSecondHighestElement(int[] inputArray){

        int max1 = inputArray[0], max2 = inputArray[0];
        for(int el: inputArray){
            if(el > max1){
                max2=max1;
                max1=el;
            } else if(el > max2){
                max2=el;
            }
        }

        return max2;
    }

    public void rotateArrayLeftSide(int[] inputArray){

        int firstEl = inputArray[0];
        for (int i=0; i < inputArray.length -1; i++){
            inputArray[i] = inputArray[i+1];
        }
        inputArray[inputArray.length -1] = firstEl;
    }


    public void rotateArrayRightSide(int[] inputArray){

        int lastEl = inputArray[inputArray.length -1];
        for (int i=inputArray.length -1; i > 1; i--){
            inputArray[i] = inputArray[i-1];
        }
        inputArray[0] = lastEl;
    }
}
