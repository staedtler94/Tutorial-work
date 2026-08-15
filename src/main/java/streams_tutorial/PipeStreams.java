package streams_tutorial;


import com.sun.jdi.event.StepEvent;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.io.*;

class StreamOrigin implements Runnable {

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
            for (int i = 0; i < _rows; i++) {
                for (float v: data_stream.getDataByRows(i))
                    dataOutputStr.writeFloat(v);
                dataOutputStr.flush();
                System.out.println("Writing Floats from Origin row number: " + i + "...");
            }
            dataOutputStr.close();
        }catch (IOException ioe){
            System.out.println(ioe);
        }
    }
}

class StreamDestination implements Runnable {

    DataInputStream dataInputStr;

    StreamDestination(@NotNull InputStream iss){
        dataInputStr=new DataInputStream(iss);
    }

    @Override
    public void run() {

        try {
            while(true) {
                float v = dataInputStr.readFloat();
                System.out.println("Writing Floats from Destination row number: " + v + "...");
            }
        }catch (IOException ioe){
            System.out.println(ioe);
        }

    }
}

public class PipeStreams {

    PipeStreams(){}

    protected void runPipeIOStreams() throws IOException {
        PipedInputStream pis = new PipedInputStream();
        PipedOutputStream pos = new PipedOutputStream();

        StreamOrigin origin = new StreamOrigin(pos, 10, 5);
        StreamDestination destination = new StreamDestination(pis);
        pis.connect(pos);

        origin.run();
        destination.run();
    }
}
