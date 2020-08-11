package arithmetic;

import java.util.Arrays;
import java.util.Scanner;

public class KeyRead_Line2 {
int n;
int ar[]=new int[100];
void read()
{  System.out.println("enter the numbers");
	Scanner scanner =new Scanner(System.in);
	
	for(int i=0;i<n;i++)
		ar[i]=scanner.nextInt();
	
}
void display()
{
	for(int i=0;i<n;i++)
		System.out.print(ar[i]+" ");
	
}
void sort()
{   System.out.print("sorted array : ");
	Arrays.sort(ar,0,n);
	
}
int find(int number)
{  
	for (int i=0;i<n;i++)
		if(ar[i]==number)
			return i;
		
			return -1;
}
}
