package HW50;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapIntinerary {
    public static void main(String[] args) {
        Map<String, String> tikets = new LinkedHashMap<>();
        tikets.put("Berlin", "London");
        tikets.put("Tokyo", "Seoul");
        tikets.put("Mumbai", "Berlin");
        tikets.put("Seoul", "Mumbai");

        Iterator<Map.Entry<String, String>> iterator = tikets.entrySet().iterator();
        String currentCity = new String();
        while (iterator.hasNext()) {
            Map.Entry<String, String> cites = iterator.next();
            if (!tikets.values().contains(cites.getKey())) {
                currentCity = cites.getKey();
            }
        }
        while (tikets.get(currentCity) != null){
            System.out.println(currentCity + " - " + tikets.get(currentCity));
            currentCity = tikets.get(currentCity);
        }
    }
}
