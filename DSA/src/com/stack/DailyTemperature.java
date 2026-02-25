package com.stack;

import java.util.Stack;

public class DailyTemperature {
    static void main(String[] args) {
        int[] temperature = {51,52,56,51,53};
        Stack<Integer> stack = new Stack<>();
        int[] result = new int[temperature.length];

        int n = temperature.length;

        for(int i=n-1; i>=0; i--){
            if(!stack.isEmpty() && temperature[i] > stack.peek()){
                stack.pop();
            } else {
                result[i] = i - 1;
            }

            stack.push(temperature[i]);
        }

    }
}
