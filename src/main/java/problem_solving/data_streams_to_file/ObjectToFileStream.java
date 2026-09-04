package problem_solving.data_streams_to_file;

import java.io.*;

public class ObjectToFileStream {

    public static void main(String[] args) {
        Customer[] list = {
                new Customer("John", "PAYG"),
                new Customer("Sam", "FreeTier"),
                new Customer("Jane", "Enterprise"),
                new Customer("Sam", "PAYG"),
                new Customer("Tom", "Enterprise"),
        };
        String name = "data/obs.txt";
        try(
                FileOutputStream fos = new FileOutputStream(name);
                ObjectOutputStream oos = new ObjectOutputStream(fos);
                FileInputStream fis = new FileInputStream(name);
                ObjectInputStream ois = new ObjectInputStream(fis)

        ){
            oos.writeInt(list.length);
            for (Customer c: list){
//                System.out.println(c);
                oos.writeObject(c);
            }

            int l = ois.readInt();
            for(int i=0; i < l; i++){
                Customer c = (Customer) ois.readObject();
                System.out.println(c);
            }
        }catch (IOException e){
            System.out.println(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}
