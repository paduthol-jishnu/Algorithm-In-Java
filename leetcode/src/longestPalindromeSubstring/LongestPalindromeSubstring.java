package longestPalindromeSubstring;

public class LongestPalindromeSubstring {
 
	public static String LPS(String str) {
		int n=str.length(); // LENGTH OF THE STRING
		
		int palindromeBeginsAt=0; //Longest Palindrome Begins from
		
		int max_length=1; // Maximum length of the String of Palindrome
		
		
		//BOOLEAN TABLE FOR FINDING PALINDROME
		boolean palindrome[][]=new boolean[n][n]; 
		
		
		
		//******Single letter palindrome*****
		for(int i=0;i<n;i++) {
			palindrome[i][i]=true;
		}
		
		//********Two letter Palindrome*******(The loop ends on "n-1" because "i==i+1"
		for(int i=0;i<n-1;i++) {
			if(str.charAt(i)==str.charAt(i+1)) {
				palindrome[i][i+1]=true;
				palindromeBeginsAt=i;
				max_length=i+1;
			}
		}
		
		
		//Finding Palindrome for 3 to n
		// First loop will start at currentLength=3 and run till n
		//Second loop will run from 0 to n-currentLength+1 
		//and j will be equal to i+currentLength-1
		
		for(int current_Length=3;current_Length<=n;current_Length++) {
			for(int i=0;i<n-current_Length+1;i++) {
				int j=i+current_Length-1;
				
				//1--> First and Last element should be equal
				//2-->Rest of the element should be palindrome
				
				if(str.charAt(i)==str.charAt(j) && palindrome[i+1][j-1]) {
					palindrome[i][j]=true;
					palindromeBeginsAt=i;
					max_length=current_Length;
				}
				
				
			}
		}
		
		
		
		return str.substring(palindromeBeginsAt, max_length+1);
		
	}
	
	public static void main(String[] args) {
		String str1="abaxabaxabbbc";
		String str2="cabb";
		System.out.println(LPS(str1));
		System.out.println(LPS(str2));
		
	}
	
}
