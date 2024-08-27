package JavaBasics;

public class Array {

	public static void main(String[] args) {
		
	int i[] = new int[4];
	i[0] = 1;
	i[1] = 3;
	i[2] = 5;
	i[3] =7;
	
	
	int j[] =new int[4];
	
	System.out.println(i.length);
	
	for(int k=0; k<i.length;k++) {
		System.out.println(i[k]);
		
	}

	
	double d[]=new double[2];
	
	d[0]=1.22;
	d[1]=5.55;
	System.out.println(d[1]);
	
	char c[] =new char [4];
	
	c[0] ='j';
	c[1] ='k';
	c[2] ='i';
	c[3] ='u';
	
	boolean b[] =new boolean[2];
	
	b[0] =true;
	b[1]= false;
	
	String s[] = new String [3];
	
	s[0] ="rt";
	s[1] ="tes";
	s[2] ="ggg";
	
	System.out.println(s.length);

	Object o[] =new Object[3];
	
	o[0]= "test";
	o[1] =4;
	o[2] = 'f';
	System.out.println(o[2]);
	
	for(int n =0; n<o.length;n++) {
		System.out.println(o[n]);
	}
}
}