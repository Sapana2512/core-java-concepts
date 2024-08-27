package JavaBasics;

public class StaticAndNonstaticConcept {
	//global var: scope of global variable across all the function with some condition
	
	String name ="Tom";//non static global var
	static int age =25;//static global var
	
	
	
	public static void main(String args[]) {
		
		//how to call static methos and var
		//1.dircet call
		sum();
		//2.calling by classname
		StaticAndNonstaticConcept.sum();
		System.out.println(age);
		System.out.println(StaticAndNonstaticConcept.age);
		
		//how to call nontsatic var and methos
		
		StaticAndNonstaticConcept obj =new StaticAndNonstaticConcept();
		obj.sendMail();
		System.out.println(obj.name);
		
		
		//can i access satic method by using objectreference? yes
		
		obj.sum();
		
	}
	
	public void sendMail() {
		System.out.println("send mail mwthod");
	}
	public static void sum() {
		System.out.println("sum method");
	}

}
