package problem_solving.data_streams_to_file;

import java.io.*;

public class DataToFileStream {
    public DataToFileStream(){}

    public static void main(String[] args) {
        float[] list = {12.0f, 32.43f, 45.0f, 50,50f, 65.09f, 78.025f, 90.85f};

        String name = "data/problem-solving-file-stream.txt";
        try(FileOutputStream fos = new FileOutputStream(name); DataOutputStream dos = new DataOutputStream(fos); FileInputStream fis = new FileInputStream(name);
        DataInputStream dis = new DataInputStream(fis);)
        {
//           Approach 2 Support
            dos.writeInt(list.length);
            for(float l : list){
                dos.writeFloat(l);
            }



//            Approach 1: Exception
//            while(true){
//                // this throws the EOFException
//                System.out.println(dis.readFloat());
//            }

//            Approach 2: read int for length and then the data
            int listLength = dis.readInt();
            for(int i=0; i < listLength; i++){
                System.out.println(dis.readFloat());
            }
            fos.close();
            dos.close();
            fis.close();
            dis.close();
        }catch (FileNotFoundException e) {
            System.out.println(e);
        } catch (IOException e) {
            System.out.println(e);
        }finally {

        }


    }

}
