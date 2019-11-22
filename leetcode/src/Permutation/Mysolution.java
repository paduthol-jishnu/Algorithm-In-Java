package Permutation;

import java.io.IOException;
import java.util.Arrays;

public class Mysolution {
	    public boolean checkInclusion(String s1, String s2) {
	        int n=s1.length();
			
	        for(int i=0;i<=s2.length()-n;i++){
	            
	            String text2=s2.substring(i,i+n);
	               if(isPermutation(s1,text2))
	               {
	                   return true;
	               }
	        }
	        return false;
	    }
	    
	    
	    static boolean isPermutation(String text1,String text2) {
			
			char [] c1=text1.toCharArray();
			char [] c2=text2.toCharArray();
			
			Arrays.sort(c1);
			Arrays.sort(c2);
			
			for(int i=0;i<text1.length();i++) {
				if(c1[i] != c2[i])
				{
					return false;
				}
			}
			
			
			return true;
			
			
		}
	    
	    public static void main(String[] args) throws IOException {
	        // BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	        // String line;
	        // while ((line = in.readLine()) != null) {
	        //     String s1 = stringToString(line);
	        //     line = in.readLine();
	        //     String s2 = stringToString(line);
	            
	            boolean ret = new Mysolution().checkInclusion("adc", "dcda");
	           
	            
	            System.out.print(ret);
	        
	    }
	}

