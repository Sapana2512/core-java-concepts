package JavaBasics;

public class MethodOverloading {
	public static void main (String args[]) {
		
		MethodOverloading obj =new MethodOverloading();
		obj.sum();
		obj.sum(10);
		obj.sum(5, 6);
	}
	
	//when method name is same with different argument or differnt para within same class
	//you cannot create method inside method
	//duplicate methods---same method name with same number of arguments are not allowed within same class
	//yes we can overload main method
	public static void main(int p) {
		
	}
	
	public static void main(int q,int o) {
		
	}

	public void sum() {
		
		System.out.println("Zero para");
	}
	
	public void sum(int i)//one input para 
	{
		System.out.println("One para");
		System.out.println(i);
	}
	
	public void sum(double k) {
		
	}
	
	public void sum( int k,int j) {
		System.out.println("two para");
		System.out.println(k+j);
	}
}
