// https://leetcode.com/problems/string-to-integer-atoi/

public class StringToInteger {
    public static void main(String[] args) {
        String s = "1337c0d3";
        System.out.println(myAtoi(s));
    }

    public static int myAtoi(String s) {
        int i = 0;
        int n = s.length();

        while(i < n && s.charAt(i) == ' '){
            i++;
        }

        int sign = 1;
        if(i<n && (s.charAt(i) == '+' || s.charAt(i) == '-')){
            sign = (s.charAt(i) == '-') ? -1 : 1;
            i++;
        }

        long result = 0;
        while(i<n && Character.isDigit(s.charAt(i))){
            int digit = s.charAt(i) - '0';
            result = result * 10 + digit;

            if(sign == 1 && result > Integer.MAX_VALUE) {
                return Integer.MAX_VALUE;
            }
            if(sign == -1 && -result < Integer.MIN_VALUE) {
                return Integer.MIN_VALUE;
            }

            i++;
        }

        return (int) (sign * result);
    }
}
