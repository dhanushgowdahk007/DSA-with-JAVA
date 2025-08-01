import java.util.Stack;

public class ReverseWordsInAString {
    public static void main(String[] args) {
        String s = "the sky is blue";
        System.out.println(reverseWords(s));
    }

    public static String reverseWords(String s) {
        Stack<String> st = new Stack<String>();
        StringBuilder str = new StringBuilder();

        for(int i=0; i<s.length(); i++){

            if(s.charAt(i) == ' '){
                if(!str.isEmpty()){
                    st.push(str.toString());
                    str = new StringBuilder();
                }
            } else {
                str.append(s.charAt(i));
            }

        }

        if(!str.isEmpty()){
            st.push(str.toString());
        }

        StringBuilder ans = new StringBuilder();

        while(st.size() != 1){
            ans.append(st.peek()).append(" ");
            st.pop();
        }
        ans.append(st.peek());

        return ans.toString();
    }
}
