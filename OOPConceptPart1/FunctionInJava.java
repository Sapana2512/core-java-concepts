package OOPConceptPart1;

public class FunctionInJava {
//main method-- starting point of execution
	public static void main(String[] args) {
		FunctionInJava obj =new FunctionInJava();
		//one obj will be created  obj is the reference var, refering to the obj
		//after creating obj , the copy of all non static methods will be given to this obj
		obj.test();
		int l =obj.pqr();
		System.out.println(l);
		String  s1=obj.qa();
		System.out.println(s1);
		int d1=obj.division(10, 2);
		System.out.println(d1);
		
		//main method is void --never return value
		
	}
		
		//non static methods
	//void ---does nt return anything
	//return type =void
		
		public void test() {//no input no output
			
			System.out.println("Test method");
		}

		//return type =int
		public int pqr() {//no input some output
			System.out.println("pqr method");
			int a=10;
			int b=20;
			int c= a+b;
			
			return c;
		}
		//return type-->String
		public String qa() {//no input some output
			System.out.println("qa method");
			String s ="Selenium";
			return s;
			
			
		}
		//return type--->int
		//x, y input parameter/arguments
		public int division(int x, int y) {
			System.out.println("division method");
			int d =x/y;
			return d;
			
		}
	}


