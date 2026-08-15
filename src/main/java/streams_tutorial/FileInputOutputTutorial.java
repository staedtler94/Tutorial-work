package streams_tutorial;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.io.*;
import java.util.Arrays;
import java.util.Collections;

public class FileInputOutputTutorial {

    private char[] toLowerCase(char[] ch){
        char[] ret = new char[ch.length];
        for (int i = 0; i < ch.length; i++) {
            char c = ch[i];
            if(c > 90 || c < 65){
                ret[i] = c;
                continue;
            }

            System.out.println((int) c);
            ret[i] = (char) ((int) c + 32);
        }
        return ret;
    }

    private int toLowerCase(int ch){
        if(ch > 90 || ch < 65)return ch;
        return (char) ((int) ch + 32);
    }

    protected void runInputOutExample(@Nullable String input, @Nullable String output){
        if(input.length() == 0)
            input = "input_reader.txt";

        if(output.length() == 0)
            output = "output_writer.txt";
        try(FileInputStream fr = new FileInputStream(input);
            FileOutputStream fw = new FileOutputStream(output)) {

            int l;
            while((l=fr.read())!= -1){
                fw.write(toLowerCase(l));
            }
            fr.close();
            fw.close();

        } catch (IOException io){
            System.out.println(io.getMessage());
        }
    }

    protected void runReaderWriteExample(){

    }

    protected  void runSequentialInputStreamsExample(@NotNull String[] inputs, @NotNull String output){
        if(inputs.length == 0){
            return;
        }

        if(output.length() == 0){
            return;
        }

        try {
            InputStream[] inputStreamsArr = new FileInputStream[inputs.length];
            int counter = 0;
            for (String input : inputs) {
                if (input.length() == 0)
                    continue;
                InputStream inputStream = new FileInputStream(input);
                inputStreamsArr[counter++] = inputStream;
            }

            SequenceInputStream st = new SequenceInputStream(Collections.enumeration(Arrays.asList(inputStreamsArr)));
            FileOutputStream fileWrite = new FileOutputStream(output);
            st.transferTo(fileWrite);

            st.close();
            fileWrite.close();
            for(InputStream inputStream : inputStreamsArr){
                inputStream.close();
            }
        } catch (IOException ioException){
            System.out.println(ioException);
        }
    }

}
