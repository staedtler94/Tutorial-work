package exception;

import java.io.FileReader;

public class TryWithResourcesDemo {


    void executeLearning(){
        try {

            this.learningTryWithResource();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
    void learningTryWithResource() throws Exception {
        // autocloseable implemented will be auto closed by try block
        // it has to implement the close method
        try(FileReader fr = new FileReader("myText.txt")){

            final int val = 256;
            int numRead;
            int counter = 0;
            StringBuilder readStr = new StringBuilder();
            System.out.println("Reading File Contents...");
            System.out.println("================= File Contents =================");
            while(true){

                char[] chBuff = new char[val];
                numRead = fr.read(chBuff);
                readStr.append(new String(chBuff, 0, numRead));

                if(numRead < val){
                    break;
                }
                counter++;
            }

            System.out.println(readStr);
            System.out.println("======================================================");
            System.out.println("Read " + (counter * val + numRead) + " characters out of a fixed buffer of " + val  );
            System.out.println("The above code highlights a way of reading iteratively for bigger files.");
        }


    }
}
