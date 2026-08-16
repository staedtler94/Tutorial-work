package file_tutorials;

import java.io.RandomAccessFile;

public class RandomAccessFileTutorials {

    RandomAccessFileTutorials(){}

    public static void main(String[] args) throws Exception {
        RandomAccessFile rm = new RandomAccessFile("input_reader.txt", "rw");
        System.out.println((char)rm.read());
        System.out.println((char)rm.read());
        System.out.println((char)rm.read());
        System.out.println((char)rm.read());
        rm.write('@'); // even after write the file pointer moves forward
        System.out.println((char)rm.read());
        rm.seek((rm.getFilePointer() -2));
        System.out.println((char)rm.read());
    }
}
