package file_tutorials;

import java.io.File;
class FileHandler {

    void fileDoesNotExist(){
        File f =  new File("data/sample_file.txt");
        if(f.isFile())
            System.out.println("It is a File " + f.getAbsoluteFile());

        if(f.isDirectory())
            System.out.println("It is a Directory " + f.getAbsolutePath());

        System.out.println(f.getAbsoluteFile());
        System.out.println(f.getAbsolutePath());
    }

    void fileExists(){
        File f =  new File("data/sample_data_file.txt");
        if(f.isFile())
            System.out.println("It is a File " + f.getAbsoluteFile());

        if(f.isDirectory())
            System.out.println("It is a Directory " + f.getAbsolutePath());

        System.out.println(f.getAbsoluteFile());
        System.out.println(f.getAbsolutePath());
    }

    void directoryExists(){
        File f =  new File("data");
        if(f.isFile())
            System.out.println("It is a File " + f.getAbsoluteFile());

        if(f.isDirectory())
            System.out.println("It is a Directory " + f.getAbsolutePath());

        System.out.println(f.getAbsoluteFile());
        System.out.println(f.getAbsolutePath());

        File[] dirList = f.listFiles();

        assert dirList != null;
        for (File file : dirList){
            System.out.println(file.getName() + " " + file.getAbsoluteFile());
        }
    }
}
public class FileHandling {
    public static void main(String[] args) {
        System.out.println("Starting FileHandling Class...");

        FileHandler fHandler = new FileHandler();
        fHandler.fileDoesNotExist();
        System.out.println();

        fHandler.fileExists();
        System.out.println();

        fHandler.directoryExists();
        System.out.println();
    }
}
