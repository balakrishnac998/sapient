package arithmetic;

import java.util.Scanner;

public class democlass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Command_Line1 cl1=new Command_Line1();
		
		cl1.setData(args);
		cl1.calData();
		
	   KeyRead_Line2 cl2=new KeyRead_Line2();
	   Scanner scanner=new Scanner(System.in);
	   System.out.println("enter count");
	   cl2.n=scanner.nextInt();
	   cl2.read();
	   cl2.display();
	   System.out.println();
	   cl2.sort();
	   System.out.println();
	   cl2.display();
	   System.out.println();
	   System.out.printf("index is %d",cl2.find(7));
	   
		

	}

}
