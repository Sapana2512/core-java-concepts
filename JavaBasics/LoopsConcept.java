package JavaBasics;

public class LoopsConcept {

	public static void main(String[] args) {
		//while loop:
		// disadv: of while loop: it will generate infinite loop if u don't give incremental/decremental part
		int i =0; //initialization
		while(i<10) { //condition
			System.out.println(i
					);
			i=i+1; //incremental, decremental
		}
		System.out.println("*************");
		//for loop
		
         for(int j =1;j<=10;j=j+1) {//initialization, conditional,incremental
        	 System.out.println(j);
         }
         System.out.println("***********");
         //-1>-10 true
         //1>10 false
        	 //print 10 to 1
        	// 10,9,8,7,6,5,4,3,2,1	
        	 for (int k=10;k>=1;k--) {
        		 System.out.println(k);
        		 
        	 }
        	 
}
	}


