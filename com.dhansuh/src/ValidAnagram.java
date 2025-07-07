import java.util.HashMap;
import java.util.Map;

public class ValidAnagram {
    public static void main(String[] args) {
        String s = "Dhansuh";
        String t = "dhanush";

        System.out.println(isAnagram(s, t));
    }

    static boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;

        Map<Character, Integer> map = new HashMap<>();

        for(char c : s.toCharArray()){
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for(char c : t.toCharArray()){
            if(!map.containsKey(c)) return false;
            map.put(c, map.get(c) - 1);
            if(map.get(c) == 0) map.remove(c);
        }

        return map.isEmpty();
    }
}
