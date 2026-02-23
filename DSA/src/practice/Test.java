package practice;

import java.util.HashMap;
import java.util.Map;
import java.lang.String;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map m1 = new HashMap<Character, Integer>();
		Map m2 = new HashMap<Character, Integer>();
		
		m2.put('A', 1);
		m2.put('B',2);
		m2.put('C',3);
		
		m1.put('A', 1);
		m1.put('B',2);
		m1.put('C',3);
		System.out.println(m1.equals(m2));

	}

}
