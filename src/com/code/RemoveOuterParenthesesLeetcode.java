package com.code;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class RemoveOuterParenthesesLeetcode {
    public static void main(String[] args) {
        String s = "(()())(())(()(()))";
        System.out.println(removeOuterParentheses(s));
    }
    public static String removeOuterParentheses(String S) {
        Stack<Character> st = new Stack();
        String result="";
        for(int i=0;i<S.length();i++){
            if(st.isEmpty() && S.charAt(i)=='('){
                st.push(S.charAt(i));
                continue;
            }
            if(st.size()==1 &&  S.charAt(i)==')'){
                st.pop();
                continue;
            }
            if( S.charAt(i)=='('){
                st.push( S.charAt(i));
            }
            if(S.charAt(i)==')'){
                st.pop();
            }
            result+=S.charAt(i);
        }
        return result;
    }
}
