package JavaBasics;

public class IfElseConcept {

	public static void main(String[] args) {
	
		
		int a =30;
		int b =20;
		
		if(b>a) {
			System.out.println("b is greater than a");
		}
		else {
			System.out.println("a is greater than b");

	}
		//comparison operators:
		//<> <=,>=,++,!=
		
		int c=40;
		int d =40;
		
		if (c==d) {
			System.out.println("c and d are equal");
			
		}
		else
		{
			System.out.println("c and d are not equal");
		}
		
		// write a logic to find highest number
		//nested if else
		int a1= 100;
		int b1= 200;
		int c1= 300;
		
		if(a1>b1 & a1>c1) {//false & false =false//false & true =false//
			System.out.println("a1 is th egreatest");
			
		}
		else if(b1>c1) {
			System.out.println("b1 is the greatest");
		}
		else
			System.out.println("c1 is the greatest");
}
}
