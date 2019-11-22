package Array;

public class ReplaceAllSpaces {

	public static void main(String[] args) {
		String text1="Mr John Smith ";
		
		addBlankSpace(text1,13);
	}
	
	public static void addBlankSpace(String text1,int textsize) {
		
		char [] charArray=text1.toCharArray();
		int count=0;
		for(int i=0;i<textsize;i++) {
			
			if(charArray[i]==' ') {
				count++;
			}
		}
		
		int afterAdding= textsize+count*3;
		
		if(textsize<text1.length())
		{
			charArray[textsize]='\0';
		}
			
		for(int i=textsize-1;i>=0;i--) {
			
			if(charArray[i]==' ') {
				charArray[afterAdding-1]='0';
				charArray[afterAdding-2]='2';
				charArray[afterAdding-3]='%';
				afterAdding=afterAdding-3;
			}else {
				charArray[afterAdding -1 ] = charArray[i];
				afterAdding--;
			}
			
		}
		for(int i=textsize-1;i>=0;i--) {
		System.out.println(charArray[i]);
		}
	}
	
}
