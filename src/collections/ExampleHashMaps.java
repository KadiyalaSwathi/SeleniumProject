package collections;

import java.util.HashMap;
import java.util.Map;

public class ExampleHashMaps {

    public static void main(String[] args) {

        Map<String,String> map = new HashMap<>();
        map.put("city","Banglore");
        map.put("name","Swathi");

       // System.out.println(map);o/p: {city=Banglore, name=Swathi}

        for(Map.Entry<String,String> test: map.entrySet()){

            System.out.println(test);
        }
    }
}
