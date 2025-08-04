// https://leetcode.com/problems/maximum-nesting-depth-of-the-parentheses/description/

public class MaximumNestingDepthOfTheParentheses {
    public static void main(String[] args) {
        String s = "(1+(2*3)+((8)/4))+1";
        System.out.println(maxDepth(s));
    }

    public static int maxDepth(String s) {
        int depth = 0;
        int maxDepth = 0;

        for(int c : s.toCharArray()){
            if(c == '('){
                depth++;
                maxDepth = Math.max(maxDepth, depth);
            } else if (c == ')'){
                depth--;
            }
        }

        return maxDepth;
    }
}
