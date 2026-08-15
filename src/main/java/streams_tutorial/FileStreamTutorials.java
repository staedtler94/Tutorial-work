package streams_tutorial;

import java.io.IOException;

public class FileStreamTutorials {

    /*
        args[0] input file name
        args[1] output file name
        args[2] transformation choice
     */
    public static void main(String[] args) {

//        if(args.length != 2)
//            return -1;
//        FileInputOutputTutorial tut1 = new FileInputOutputTutorial();
//        tut1.runInputOutExample(args[0], args[1]);
//        ===========================
//        String[] inputs = {"input_reader.txt", "myText.txt"};
//        tut1.runSequentialInputStreamsExample(inputs, "sequential_writer.txt");
//        ===========================

        PipeStreams pi = new PipeStreams();
        try {
            pi.runPipeIOStreams();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
