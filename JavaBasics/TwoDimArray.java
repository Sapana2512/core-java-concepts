package JavaBasics;

public class TwoDimArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String x[][]=new String [3][5];
		
		System.out.println(x.length);//total no of raws=3
		System.out.println(x[0].length);//total no of columns=5
		 //1st raw
		x[0][0]="A";
		x[0][1]="B";
		x[0][2]="c";
		x[0][3]="D";
		x[0][4]="E";
		
		//2nd raw
		x[1][0]="A1";
		x[1][1]="B1";
		x[1][2]="c1";
		x[1][3]="D1";
		x[1][4]="E1";
		
		//3rd raw
		x[2][0]="A2";
		x[2][1]="B2";
		x[2][2]="c2";
		x[2][3]="D2";
		x[2][4]="E2";
		
		System.out.println(x[1][2]);
		System.out.println(x[2][2]);
		System.out.println(x[0][4]);
		
		//print all the value of 2 d array:use for loop
		//row =0,col= 0 to 4
		//row =1, col = 0 to 4
		//row = 2, col = 0 to 4
		
		for (int row =0; row<x.length;row++) {
			for (int column=0;column<x[0].length;column++) {
				System.out.println(x[row][column]);
			}
		}
		
		
		
		
	}

}
