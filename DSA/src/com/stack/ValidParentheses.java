package com.stack;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParentheses {
    static boolean checkValid(String s){

        Stack<Character> stack = new Stack<>();
        Map<Character, Character> map = new HashMap<>();

        map.put('}', '{');
        map.put(')', '(');
        map.put(']', '[');

        for(char c : s.toCharArray()){
            if(!map.containsKey(c)){
                stack.push(c);
            } else if(map.containsKey(c) && map.get(c) == stack.peek()){
                stack.pop();
            } else {
                return false;
            }
        }

        return stack.isEmpty();
    }

    static void main(String[] args) {
        System.out.println(checkValid("([]()[]())"));
    }
}
