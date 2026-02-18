package com.array;
// Java implementation of group anagrams
import java.util.*;

public class GroupAnagrams {
    public static List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> anagramMap = new HashMap<>();
        
        for (String word : strs) {
        	char[] chararr = new char[26];
        	for (char c: word.toCharArray()){
        		chararr[c-'a']++;
        	}
        	String key = String.valueOf(chararr);
        	anagramMap.computeIfAbsent(key, k->k);
        }
        
        return new ArrayList<>(anagramMap.values());
    }

    public static void main(String[] args) {
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> result = groupAnagrams(strs);
        System.out.println(result);
    }
}
