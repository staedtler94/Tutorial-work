package file_tutorials.serialization;

import java.io.*;

enum MetricSystem {
    SI,
    IMPERIAL,
    Natural
}

record CoordinateSystem(float X, float Y, double precision, int burst, MetricSystem mSystem, String name, Boolean isCentered){}

public class DataStreamDemo {
    public static void main(String[] args) throws IOException {
        final String filename = "data/data_stream_demo.txt";

        FileOutputStream fos = new FileOutputStream(filename);
        DataOutputStream dos = new DataOutputStream(fos);
        CoordinateSystem cs = new CoordinateSystem(0f,0f, 0.000001, 1000, MetricSystem.SI, "center", true);
        dos.writeFloat(cs.X());
        dos.writeFloat(cs.Y());
        dos.writeDouble(cs.precision());
        dos.writeInt(cs.burst());
        dos.writeUTF(String.valueOf(cs.mSystem()));
        dos.writeUTF(cs.name());
        dos.writeBoolean(cs.isCentered());

        FileInputStream fis = new FileInputStream(filename);
        DataInputStream dis = new DataInputStream(fis);
        CoordinateSystem redCs = new CoordinateSystem(
                dis.readFloat(),
                dis.readFloat(),
                dis.readDouble(),
                dis.readInt(),
                MetricSystem.valueOf(dis.readUTF()),
                dis.readUTF(),
                dis.readBoolean()
        );

        System.out.println(redCs);
    }
}
