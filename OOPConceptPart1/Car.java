package OOPConceptPart1;

public class Car {
	
	//Class vars:
	int mod;
	int wheels;
	
	
	

	public static void main(String[] args) {
		//new Car()..this is object of car class
		
		//new keyword is used to create obj
		//a,b,c---object reference variables
		
		Car a= new Car();
		Car b =new Car();
		Car c =new Car();
		
		a.mod=2015;
		a.wheels=4;
		
		b.mod=2014;
		b.wheels=4;
		
		c.mod=2013;
		c.wheels=4;
		
		System.out.println("before assigining the ref");
		
		System.out.println(a.mod);
		System.out.println(a.wheels);
		System.out.println(b.mod);
		System.out.println(b.wheels);
		System.out.println(c.mod);
		System.out.println(c.wheels);
		
		System.out.println("After shiffting refernces");
		a=b;
		b=c;
		c=a;
		
		a.mod=10;
		System.out.println(a.mod);
		c.mod=20;
		System.out.println(a.mod);
		System.out.println(c.mod);
		
		
		
	}

}
