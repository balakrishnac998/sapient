package arithmetic;

import java.util.Scanner;

public class Command_Line1 {
	int n;
    int ar[]= new int[100];
    void setData(String args[])
    {  Scanner scanner = new Scanner(System.in);
    n=args.length;
    	for(int i=0;i<args.length;i++)
    	{
    		
    		this.ar[i]=Integer.parseInt(args[i]);
    		
    	}
    }
    void calData()
    {   int sum,biggest,smallest;
    	sum=ar[0];
    	biggest=this.ar[0];
    	smallest=ar[0];
    	for(int i=1;i<n;i++)
    		{ sum+=ar[i];
    		if(ar[i]>biggest)
    			biggest=ar[i];
    		if(ar[i]<smallest)
    			smallest=ar[i];
    		
    		
    		}
    	double avg= (double)sum/n;
    	System.out.println("sum: "+sum);
    	System.out.println("Average: "+avg);
    	System.out.println("Biggest: "+biggest);
    	System.out.println("Smallest: "+smallest);
    		
    		
    }
}
