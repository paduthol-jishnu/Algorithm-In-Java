package Array;

public class UniqueCharacters {
	
	public static void main(String[] args) {
		
		String text1="kajshdkfgjdsfgdfsdf";
		String text2="asdfghjklqwertyu";
	
		System.out.println("Text1 has unique value="+uniqueChar(text1));
		System.out.println("Text2 has unique value="+uniqueChar(text2));
	}

	public static boolean uniqueChar(String text) {
		int size=text.length();
		if(size>256) {
			return false;
		}
		
		boolean[] character=new boolean[256];
		for(int i=0;i<size;i++) {
			int ascii=text.charAt(i);
			
			if(character[ascii]) {
				return false;
			}
			
			character[ascii]=true;
		}
		return true;
	}
}

//Time complexity is o[n]
// We can do it little bit more time complexity of o[nlogn]
//using Array.sort[character]; where character is an array of char

//public static boolean uniqueChar(String text) {
//    char[] characters = text.toCharArray();
//    // Arrays.sort (DualPivotQuicksort algorithm) sorts arrays in O(nlog(n))
//    Arrays.sort(characters);
//    int size = characters.length - 1;
//    for (int i = 0; i < size; i++) {
//        if (characters[i] == characters[i + 1]) {
//            return false;
//        }
//    }
//    return true;
//}