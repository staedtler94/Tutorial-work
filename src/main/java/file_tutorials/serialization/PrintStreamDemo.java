package file_tutorials.serialization;

import org.jetbrains.annotations.NotNull;

import java.io.*;

record DataObject(int id, String name, String action, boolean alive){};

class DataObjectHelper {

    void writer(PrintStream ps, DataObject d1 ){
        ps.println(d1.id());
        ps.println(d1.name());
        ps.println(d1.action());
        ps.println(d1.alive());
    }

    DataObject read(BufferedReader bis) throws IOException {
        int id = Integer.parseInt(bis.readLine());
        String name = bis.readLine();
        String action = bis.readLine();
        boolean alive = Boolean.parseBoolean(bis.readLine());
        return new DataObject(id, name, action, alive);
    }
}

class ObjectPrinterOutput{

    void writeObject(@NotNull String input_path, DataObject d) throws FileNotFoundException {
        FileOutputStream fos = new FileOutputStream(input_path);
        PrintStream ps = new PrintStream(fos);
        new DataObjectHelper().writer(ps,d);
    }
}

class ObjectReaderInput{

    DataObject readObject(@NotNull String input_path) throws IOException {
        FileInputStream fis = new FileInputStream(input_path);
        BufferedReader bis = new BufferedReader(new InputStreamReader(fis));
        return new DataObjectHelper().read(bis);
    }
}

public class PrintStreamDemo {
    public static void main(String[] args) {
        DataObject d1 = new DataObject(10, "Sample_data_obj", "run", true);
        String input_path = "data/sample_object_writer.txt";
        ObjectPrinterOutput output = new ObjectPrinterOutput();
        ObjectReaderInput reader = new ObjectReaderInput();
        try {
            output.writeObject(input_path, d1);
            DataObject d2 = reader.readObject(input_path);
            System.out.println(d2.equals(d1));
        } catch (FileNotFoundException e) {
            System.out.println(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
