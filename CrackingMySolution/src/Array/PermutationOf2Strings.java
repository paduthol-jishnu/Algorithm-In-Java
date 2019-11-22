package Array;

import java.util.Arrays;

public class PermutationOf2Strings {
	
	
	public static void main(String[] args) {
		String text1="abce";
		String text2="cbae";
		
		System.out.println("Text2 is permutation of text1"+isPermutation(text1,text2));
	}
	
	static boolean isPermutation(String text1,String text2) {
	
		int n1=text1.length();
		int n2=text2.length();
		
		if(n1 != n2) {
			return false;
		}
		else{ 
		char [] c1=text1.toCharArray();
		char [] c2=text2.toCharArray();
		
		Arrays.sort(c1);
		Arrays.sort(c2);
		
		for(int i=0;i<n1;i++) {
			if(c1[i] != c2[i])
			{
				return false;
			}
		}
		
		}
		return true;	
	}	
}




//		static boolean isPermutation(String text1,String text2) {
//		if(text1.length() != text2.length()) {
//			return false;
//		}
//		
//		int [] letters=new int[128];
//		
//		char [] s_array=text1.toCharArray();
//		
//		for(char c: s_array) {
//			letters[c]++;
//			System.out.println(letters[c]);
//		}
//		
//		for(int i=0;i<text2.length();i++) {
//			int c=(int) text2.charAt(i);
//			letters[c]--;
//			
//			if(letters[c]<0) {
//				return false;
//			}
//		}
//		
//		
//		
//		
//		return true;
//	}
//
//}
