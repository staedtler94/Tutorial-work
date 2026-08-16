package streams_tutorial;


import com.sun.jdi.event.StepEvent;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.io.*;


// this class can read file but can be used to read data from database, excel rows, video chunks, image chunks pixelated etc...
class StreamOrigin extends Thread  {

    DataOutputStream dataOutputStr;
    DataRecord data_stream;
    int _rows, _cols;

    StreamOrigin(@NotNull OutputStream oss, @Nullable int rows, @Nullable int cols){
        dataOutputStr=new DataOutputStream(oss);
        _rows = rows != 0 ? rows : 1000;
        _cols = cols != 0 ? cols : 100;
        data_stream = new DataRecord(_rows, _cols);
    }

    @Override
    public void run() {

        try {
            float sum = 0;
            for (int i = 0; i < _rows; i++) {
                for (float v: data_stream.getDataByRows(i)){
                    dataOutputStr.writeFloat(i+v);
                    sum += (i+v);
                    System.out.println("Writing Floats from Origin: " + (i + v));
                }
                // this flushes entire col data
                dataOutputStr.flush();
                System.out.flush();
                Thread.sleep(100);
            }
            System.out.println(sum);
            dataOutputStr.close();
        }catch (IOException | InterruptedException ioe){
            System.out.println(ioe);
        }
    }
}

class StreamDestination extends Thread {

    DataInputStream dataInputStr;

    StreamDestination(@NotNull InputStream iss){
        dataInputStr=new DataInputStream(iss);
    }

    @Override
    public void run() {
        float sum = 0;
        try {
            while(true) {
                // this reads one by one
                float v = dataInputStr.readFloat();
                sum+=v;
                System.out.println("Writing Floats from Destination: " + v);
                Thread.sleep(1);
            }
        }catch (EOFException | InterruptedException ioe){
            System.out.println("Destination Sum = " + sum);
            System.out.println(ioe);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

public class PipeStreams {

    PipeStreams(){}

    protected void runPipeIOStreams() throws IOException {
        PipedInputStream pis = new PipedInputStream();
        PipedOutputStream pos = new PipedOutputStream();
        pis.connect(pos);

        StreamOrigin origin = new StreamOrigin(pos, 100, 10);
        StreamDestination destination = new StreamDestination(pis);

        origin.start();
        destination.start();
    }
}
