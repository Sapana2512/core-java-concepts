package JavaBasics;

public class ArrayConcept {

	public static void main(String[] args) {
		
		//array: to store similar data type values in a array variable
		//lowest bound /index =0
		//upper bound/index =n-1(n is size of array)
		//one dim array
		
		//disadv of one dim array:
		//1. size is fixed-- static array...To overcome this problem, we use collections--ArrayList,HashTable---Dynamic array
		//2. store only similar data type... To overcome of this problem, we use object array.
		
		//1. int array:
		int i[]=new int[4];
		i[0]=10;
		i[1]=20;
		i[2]=30;
		i[3]=40;
		
		System.out.println(i[2]);
		System.out.println(i[3]);
		//System.out.println(i[4]);//array index out of bound exception
		System.out.println(i.length);//size of array
		
		//print all the values of array:use for loop
		for(int j=0; j<i.length;j++) {
			System.out.println(i[j]);
		}
		
		//2. double array
		double d[] =new double[3];
		d[0] =12.33;
		d[1]=25.55;
		d[2]=99.33;
		System.out.println(d[2]);
		

	
	//3. charcater array
	
	char c[]=new char[3];
	c[0]='q';
	c[1]='p';
	c[2]='f';
	System.out.println(c[1]);
	
	//4 boolean array
	
	boolean b[]=new boolean[2];
	b[0]=true;
	b[1]=false;
	
	
	//5 string array
	String s[]=new String[3];
	s[0]="Hello";
	s[1]="world";
	s[2]="Selenium";
	System.out.println(s.length);
	System.out.println(s[1]);
	
	//6.Object Array (objevt is class) is used to store different data types value
	
	Object ob[] =new Object[6];
	ob[0]="Tom";
	ob[1]=25;
	ob[2]=12.33;
	ob[3]="1/1/1990";
	ob[4]='M';
	ob[5]="London";
	System.out.println(ob[5]);
	System.out.println(ob.length);
	
	}
}
