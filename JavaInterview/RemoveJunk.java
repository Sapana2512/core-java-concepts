package JavaInterview;

public class RemoveJunk {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String  s ="!@#$1234568";
		String s1= "@%^$^%&test@&^%&^*Selenium^&%&*^@*&@*&JAVA";
		
		
		//Regular expression we have to use [^a-zA-Z0-9]
		
		s=s.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(s);
		s1=s1.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(s1);
		
		

	}

}
