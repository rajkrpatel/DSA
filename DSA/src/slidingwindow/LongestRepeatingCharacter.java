package slidingwindow;

public class LongestRepeatingCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "AABABBA";
		int k=3;
		String s1= s;
		
		for(int i=0; i<k; i++) {
			s1 = s1.replaceFirst("A", "B");
		}
		
		
		int left = 0;
		int right = 0;
		int longestStringLength = 0;
		String longestString = "";
		
		while(right<s1.length()-1) {
			if(s1.charAt(right) == s1.charAt(right+1)) {
				right++;
				int currentLength = right-left+1;
				if(currentLength > longestStringLength) {
					longestStringLength = currentLength;
					longestString = s1.substring(left, longestStringLength);
				}
			} else {
				right++;
				left = right;
			}			
		}
		
		System.out.print(longestStringLength);
		System.out.print(longestString);
	}

}
