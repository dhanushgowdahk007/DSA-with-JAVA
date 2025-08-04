public class RomanToInteger {
    public static void main(String[] args) {
        String s = "LVIII";
        System.out.println(romanToInt(s));
    }

    public static int romanToInt(String s) {
        int total = 0;
        for (int i = 0; i < s.length(); i++) {
            int value = getValue(s.charAt(i));

            if (i + 1 < s.length() && value < getValue(s.charAt(i + 1))) {
                total -= value; // Subtractive case
            } else {
                total += value; // Normal case
            }
        }
        return total;
    }

    private static int getValue(char c) {
        return switch (c) {
            case 'I' -> 1;
            case 'V' -> 5;
            case 'X' -> 10;
            case 'L' -> 50;
            case 'C' -> 100;
            case 'D' -> 500;
            case 'M' -> 1000;
            default -> 0;
        };
    }
}
