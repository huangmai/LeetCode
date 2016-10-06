package huangmai.leetCode.problems.stringProblem;

import java.util.Stack;

public class P0020 {
    public boolean isValid(String s) {
        if(s.isEmpty()){
            return true;
        }
        Stack<Character> st = new Stack<>();
        char t;
        for(char c : s.toCharArray()){
            switch(c){
            case '(':
                st.push(')');
                break;
            case '[':
                st.push(']');
                break;
            case '{':
                st.push('}');
                break;
            case ')':
            case ']':
            case '}':
               t = st.empty() ? ' ' : st.pop();
               if(t != c){
                   return false;
               }
               break;
            default:
                return false;
            }
        }
        return st.empty();
    }
}
