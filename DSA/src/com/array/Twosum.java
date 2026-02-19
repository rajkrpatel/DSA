package com.array;

import java.util.HashMap;
import java.util.Map;

/*
Two Sum

Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice. You can return the answer in any order.

Array list = { 8, 5, 4, 15,12, 7, 2}  target= 11

*/
public class Twosum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] list = { 8, 5, 4, 15, 12, 7, 2 };
		int target = 11;
		//create a map with key as number and value as indice
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		for(int i=0; i<list.length; i++) {
			int diff = target - list[i];
			if(map.get(diff) == null) {
				map.put(list[i], i);
			} else {
				System.out.println("Indices are :" + i + " & " + map.get(diff));
			}
		}
		
	}
}
