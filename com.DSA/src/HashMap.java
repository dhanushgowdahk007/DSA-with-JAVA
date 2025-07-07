import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

// A HashMap is a data structure that is used to store and retrieve values based on keys

// HashMap provides 4 constructors and the access modifier of each is public which are listed as follows:
//
// HashMap()
// HashMap(int initialCapacity)
// HashMap(int initialCapacity, float loadFactor)
// HashMap(Map map)

public class HashMap {
    public static void main(String[] args) {

        Map<String, Integer> map = new java.util.HashMap<>();

        map.put("Dhansuh", 4);
        map.put("Adviek", 17);
        map.put("Partha", 21);

        System.out.println(map);

        map.remove("Adviek");

        System.out.println(map.containsKey("Adviek"));

//        ConcurrentHashMap
    }
}
