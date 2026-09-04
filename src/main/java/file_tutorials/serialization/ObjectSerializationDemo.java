package file_tutorials.serialization;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

record Row(int rank, String name, int points)implements Serializable{

}
class LeaderBoard implements Serializable{

    int boardId;
    String boardName;
    Boolean isAlive;
    int numberOfEntries;
    List<Row> boardEntries;
    volatile int counter;
    public int special_value;

    // does not serialize transient and static type values
    transient int store;

    public LeaderBoard(int boardId, String boardName, Boolean isAlive, int numberOfEntries, List<Row> boardEntries, int counter, int special_value) {
        this.boardId = boardId;
        this.boardName = boardName;
        this.isAlive = isAlive;
        this.numberOfEntries = numberOfEntries;
        this.boardEntries = boardEntries;
        this.counter = counter;
        this.special_value = special_value;
        this.store = 42314214;
    }

    @Override
    public String toString() {
        return "LeaderBoard{" +
                "boardId=" + boardId +
                ", boardName='" + boardName + '\'' +
                ", isAlive=" + isAlive +
                ", numberOfEntries=" + numberOfEntries +
                ", boardEntries=" + boardEntries +
                ", counter=" + counter +
                ", special_value=" + special_value +
                ", transient store value=" + store +
                '}';
    }

    public LeaderBoard(){}

}

public class ObjectSerializationDemo {

    public static void main(String[] args) throws IOException {
        String name = "data/object_stream_demo_serialization.ser.txt";

        FileOutputStream fos = new FileOutputStream(name);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        List<Row> entries = new ArrayList<>();
        entries.add(new Row(1,"John", 100));
        entries.add(new Row(2,"Jane", 90));
        entries.add(new Row(3,"Shane", 80));

        LeaderBoard ld1 = new LeaderBoard(
                101,
                "sample-board-name",
                true,
                entries.size(),
                entries,
                100,
                12345
        );
        try{
            oos.writeObject(ld1);
            FileInputStream fis = new FileInputStream(name);
            ObjectInputStream ois = new ObjectInputStream(fis);

            LeaderBoard ld2 = (LeaderBoard) ois.readObject();
            System.out.println(ld2.equals(ld1));
            System.out.println(ld1.toString());
            System.out.println(ld2.toString());
        }catch (IOException | ClassNotFoundException e){
            System.out.println(e);
        }
    }
}
