package input_output.examples;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferUTube {
    public static void main(String[] args) {
        try{
            String[] array = new String[] { "Lion", "Tiger", "Jaguar"};
            BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\Administrator\\Desktop\\Coding\\IO Example\\SuperSectretFile.txt"));
            for(String s : array){
                bw.write(s+ "\n");

            }
            bw.close();


        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
