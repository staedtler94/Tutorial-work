package file_tutorials.serialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

record DataObject (int id, String name, String action, boolean alive){
    void writer(PrintStream ps){
        ps.println(this.id());
        ps.println(this.name());
        ps.println(this.action());
        ps.println(this.alive());
    }

    void read(){}
}

class ObjectPrinterOutput{

    void writeObject(DataObject d) throws FileNotFoundException {
        FileOutputStream fos = new FileOutputStream("data/sample_object_writer.txt");
        PrintStream ps = new PrintStream(fos);
        d.writer(ps);
    }
}

class ObjectReaderINput{

    void readObject(){

    }
}

public class PrintStreamDemo {
    public static void main(String[] args) {
        DataObject d1 = new DataObject(10, "Sample_data_obj", "run", true);

        ObjectPrinterOutput output = new ObjectPrinterOutput();
        try {
            output.writeObject(d1);
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }
    }
}
