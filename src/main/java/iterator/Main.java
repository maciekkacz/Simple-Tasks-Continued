package iterator;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        Map<String, String> names = new TreeMap<>();
        names.put("Maciej", "Kaczmarczyk - 31");
        names.put("Ala", "Bala - 15");
        names.put("Mietek", "Tetek - 22");
        names.put("Bartek", "Pattak - 40");
        names.put("Michal", "Pisz - 55");

        Iterator<String> valuesIterator = names.values().iterator();
        while (valuesIterator.hasNext()){
            String name = valuesIterator.next();
            System.out.println(name);
        }
    }
}
