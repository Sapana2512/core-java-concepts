package JavaBasics;

public class StringConcatenation {
	//+ is concatination operator
	// println is used to print in new line

	public static void main(String[] args) {
		
		int a =100;
		int b =200;
		
		String x= "Hello";
		String y ="World";
		
		double c =12.33;
		double d =18.77;
		
		System.out.println(a+b);
		System.out.println(x+y);
		System.out.println(a+b+x+y);
		System.out.println(x+y+a+b);
		System.out.println(x+y+(a+b));
		System.out.println(a+b+x+y+a+x+b+y);
		System.out.println(a+b+x+y+a+b);
		System.out.println(c+d);
		System.out.println(x+y+c+d);
		System.out.println("Hello World");
		System.out.println(a);
		System.out.println("The value of a is:"+a);
		System.out.println("the value of b is"+b);
		System.out.println("The value of a and b is"+(a+b));
		
		// TODO Auto-generated method stub

	}

}
