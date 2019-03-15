import java.util.*;

public class weather{

    public static void main(String[] args){
        textProccessor tp = new textProccessor("weather_report.txt");
        String lines[] = tp.output.split("[\\r\\n]+");

        System.out.println(Arrays.toString(lines));
        /*
        for(int i = 0; i < lines.length ; i++){
            System.out.println("location => " + lines[i].substring(0,14).replaceAll(" ", ""));
            System.out.println("weather => " + lines[i].substring(0,23).replaceAll(" ", ""));

        }*/

    }

}