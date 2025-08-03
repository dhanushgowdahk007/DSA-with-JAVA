// https://leetcode.com/problems/valid-anagram/

// Given two strings s and t, return true if t is an anagram of s, and false otherwise.

import java.util.Arrays;

public class VlaidAnagram {
    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";

        System.out.println(isAnagram(s, t));
    }

    public static boolean isAnagram(String s, String t) {

        if(s.length() != t.length()) return false;
        char[] charOfS = s.toCharArray();
        char[] charOfT = t.toCharArray();

        Arrays.sort(charOfS);
        Arrays.sort(charOfT);

        for(int i=0; i<charOfS.length; i++){
            if(charOfS[i] != charOfT[i]) return false;
        }

        return true;
    }
}
