public class IsomorphicStrings {
    public static void main(String[] args) {
        String s = "egg";
        String t = "add";
        System.out.println(isIsomorphic(s, t));
    }


    public static boolean isIsomorphic(String s, String t) {

        if(s.length() != t.length()) return false;

        // Map<Character, Character> mapST = new HashMap<>();
        // Map<Character, Character> mapTS = new HashMap<>();

        // for(int i=0; i<s.length(); i++){
        //     char c1 = s.charAt(i);
        //     char c2 = t.charAt(i);

        //     if(mapST.containsKey(c1)){
        //         if(mapST.get(c1) != c2) return false;
        //     } else {
        //         mapST.put(c1, c2);
        //     }

        //     if(mapTS.containsKey(c2)){
        //         if(mapTS.get(c2) != c1) return false;
        //     } else {
        //         mapTS.put(c2, c1);
        //     }
        // }

        int[] mapST = new int[256];
        int[] mapTS = new int[256];

        for(int i=0; i<s.length(); i++){
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);

            if(mapST[c1] == 0 && mapTS[c2] == 0){
                mapST[c1] = c2;
                mapTS[c2] = c1;
            } else {
                if(mapST[c1] != c2 && mapTS[c2] != c1) return false;
            }
        }

        return true;
    }
}
