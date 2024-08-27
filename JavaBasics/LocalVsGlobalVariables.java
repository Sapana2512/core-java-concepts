package JavaBasics;

public class LocalVsGlobalVariables {
	//global variable//class variable
	String name ="Tom";
	int age = 25;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i = 10;//local variable
		System.out.println(i);
		LocalVsGlobalVariables obj = new LocalVsGlobalVariables();
		System.out.println(obj.name);
		System.out.println(obj.age);

	}
	
	public void sum() {
		int i =10;
		int j =20;
		 int age =25;
	}

}
