package JavaInterview;

public class Stringreverse {

	public static void main (String args[] ){
		//1. using foor loop	
		
		
		 String s ="Selenium";
		// int len =s.length(); String rev="";
		 
		// for (int i =len-1;i>=0;i--) { rev =rev+s.charAt(i); }
		 
		 // System.out.println(rev);
		 
		
		//2.using stringbufferclass
		StringBuffer sf =new StringBuffer(s);
		System.out.println(sf.reverse());
			
		
	}
}
