import java.util.*;

public class weather{

    public static void main(String[] args){
        textProccessor tp = new textProccessor("weather_report.txt");
        String lines[] = tp.output.split("[\\r\\n]+");
        ArrayList<location> l = new ArrayList<location>;

        for(int i = 0; i < lines.length ; i++){
            location temp_loc = new location();
            temp_loc.name = getSubString(0, 14, lines[i]);
            temp_loc.weather = getSubString(14, 24, lines[i]);
            temp_loc.loc = getSubString(25, 27, lines[i]);

            System.out.println("location => " + getSubString(0, 14, lines[i]));
            System.out.println("weather => " + getSubString(14, 24, lines[i]));
            System.out.println("temp => " + getSubString(25, 27, lines[i]));
            System.out.println("dew_point => " + getSubString(29, 31, lines[i]));
            System.out.println("rel_humidity => " + getSubString(33, 35, lines[i]));
            System.out.println("wind => " + getSubString(36, 39, lines[i]));
            System.out.println("pressure => " + getSubString(46, 51, lines[i]));
        }

    }

    public static String getSubString(int start, int end, String in){
        return in.substring(start,end).replaceAll(" ", "");
    }

}