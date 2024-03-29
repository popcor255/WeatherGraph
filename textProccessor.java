import java.util.*;
import java.io.*;

public class textProccessor extends IOException{

    public String output = "";
    private boolean isRead = false;

    public textProccessor(String filename){
        try{
            BufferedReader br = new BufferedReader(new FileReader(filename));
            StringBuilder sb = new StringBuilder();
            String line = null;

        
            while (line != null || isRead == false) {
                sb.append(line);
                sb.append(System.lineSeparator());
                try{
                    line = br.readLine();
                    if(line != null){
                        output += line + "\n";
                    }
                }
                catch (IOException ex){
                    System.out.println("ERROR: ISSUE WITH FILE STREAM!");
                }
                isRead = true;
            }
        }
        catch (FileNotFoundException ex){
            System.out.println("ERROR: FILE NOT FOUND!");
        }
    }

}