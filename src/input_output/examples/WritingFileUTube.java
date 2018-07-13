package input_output.examples;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WritingFileUTube {
    public static void main(String[] args) throws IOException {
        //to write a file you need a buffered file writer. adv of buffered is its more efficient and faster

        try (BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\Administrator\\Desktop\\Coding\\IO Example\\SuperSectretFile.txt"));
        ){
            bw.write("Theres no secret");
        }catch(IOException ex){

        }
    }
}
