import java.util.*;

public class weather{

    public static void main(String[] args){
        textProccessor tp = new textProccessor("weather_report.txt");
        String lines[] = tp.output.split("[\\r\\n]+");
        HashSet<String> names = new HashSet();
        ArrayList<location> l = new ArrayList<location>();

        for(int i = 0; i < lines.length ; i++){
            location temp_loc = new location();
            temp_loc.name = getSubString(0, 14, lines[i]);
            temp_loc.weather = getSubString(14, 24, lines[i]);
            temp_loc.temp = getSubString(25, 27, lines[i]);
            temp_loc.dew_point = getSubString(29, 31, lines[i]);
            temp_loc.rel_humidity = getSubString(33, 35, lines[i]);
            temp_loc.wind = getSubString(36, 39, lines[i]);
            temp_loc.pressure = getSubString(46, 51, lines[i]);
            
            if(!names.contains(temp_loc.name)){
                l.add(temp_loc);
                names.add(temp_loc.name);
            }
        }


        for(location ele: l){
            if(ele.weather.equals("SUNNY")){
                System.out.println("Location: " + ele.name);
            }
        }
        
    }

    public static String getSubString(int start, int end, String in){
        return in.substring(start,end).replaceAll(" ", "");
    }

}