package JavaBasics;

public class ConstructorConcepts {
	String name;
	int age;
	
	public ConstructorConcepts() {
		System.out.println("Default constructor");
		
	}
	public ConstructorConcepts(int i) {
		System.out.println("Default one para constructor");
	}
	
	public ConstructorConcepts(int i, int j) {
		System.out.println("Default two para constructor");
	}
	
	public ConstructorConcepts(String name,int age) {
		this.name =name; //class var =local var
		this.age =age;
		//name =name1
		//age =age1
		
		
	}

	public static void main(String[] args) {
		
		ConstructorConcepts obj =new ConstructorConcepts();
		ConstructorConcepts obj1 =new ConstructorConcepts(10);
		ConstructorConcepts obj2 =new ConstructorConcepts(10,20);
		ConstructorConcepts obj3 =new ConstructorConcepts("Tom",20);
		
		System.out.println(obj.name);
		System.out.println(obj.age);
		//Constructor never return value
		//same name as class name
		//if we are not passing anything default constructor is called
		
	}

}
