package collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ExampleHashMaps1 {

    public static void main(String[] args) {

        List<String> a = new ArrayList<>();
        a.add("apple");
        a.add("alphabet");

        ArrayList<String> b = new ArrayList<>();
        b.add("bloomberg");
        b.add("bloom");

        HashMap<String, List<String>> map = new HashMap<>();
        map.put("A",a);
        map.put("B",b);
        for(Map.Entry<String,List<String>> test: map.entrySet()){

            System.out.println(test);
        }

    }
}