package input_output.examples;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;
 /*
public class TryWithStatementUT {
    public static void main(String[] args) throws IOException {
        ArrayList<>;
        //declare buffered reader to be null
        try (FileReader fr = new FileReader(args[0]); BufferedReader br new BufferedReader(fr)){
            if(args.length <= 0){
                System.out.println("please provide a path to a file to read");
                return;
            }

            //open file from path provided
            fr = new FileReader(args[0]);

            //open buffered reader
            br = new BufferedReader(fr);

            String line;
            line = br.readLine();
            while ((line.length() >0)){
                String[] values = line.split(",");
                RefugeeData row = new RefugeeData(values[0]), Integer.parseInt(values[1]);
                data.add(row);

            }


            } catch (Exception e){
            System.out.println("an exception occurs");
        }
        finally {
            br.close();
            fr.close();
        }
    }
}
*/