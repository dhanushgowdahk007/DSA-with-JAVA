// https://leetcode.com/problems/sort-characters-by-frequency/description/

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class SortCharacterByFrequency {
    public static void main(String[] args) {
        String s = "tree";
        System.out.println(frequencySort(s));
    }

    public static String frequencySort(String s){
        Map<Character, Integer> freqMap = new HashMap<>();
        StringBuilder sb = new StringBuilder();

        for(char c : s.toCharArray()){
            freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
        }

        PriorityQueue<Map.Entry<Character, Integer>> maxHeap = new PriorityQueue<>((a,b) -> b.getValue() - a.getValue());

        maxHeap.addAll(freqMap.entrySet());

        while(!maxHeap.isEmpty()){
            Map.Entry<Character, Integer> entry = maxHeap.poll();

            char c = entry.getKey();
            int freq = entry.getValue();

//            for(int i=0; i<freq; i++){
//                sb.append(c);
//            }

            sb.append(String.valueOf(c).repeat(Math.max(0, freq)));
        }

        return sb.toString();
    }
}
