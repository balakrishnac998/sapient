package week4;

import java.util.Arrays;
import java.util.Collections;

public class Int_Arr_Process {
    int []arr;
	Int_Arr_Process()
	{
		arr=new int[10];
	}
	Int_Arr_Process(int n)
	{
		arr=new int[n];
	}
	Int_Arr_Process(int [] ob)
	{
		arr=ob;
	}
	Int_Arr_Process(Int_Arr_Process ob)
	{
		arr=ob.arr;
	}
	public void read()
	{
		for(int i=0;i<arr.length;i++)
		{
		arr[i]=input.br.nextInt();
		}
	}
	public void dispv()
	{
		for(int e:arr) {
			System.out.println(e);
		}
	}
	public void disph() {
		for(int e:arr)
		{
			System.out.print(e+" ");
		}
	}
	public void sort()
	{
		Arrays.sort(arr);
	}
    public int max()
    {   int ans=arr[0];
    	for(int e:arr)
    	{
    		if(ans<e)
    			ans=e;
    	}
    	return ans;
    }
    public int min()
    {   int ans=arr[0];
    	for(int e:arr)
    	{
    		if(ans>e)
    			ans=e;
    	}
    	return ans;
    }
    public int sum()
    {  int sum=0;
    	for(int e:arr)
    	{
    		sum+=e;
    	}
    	return sum;
    }
    public int secmax()
    {
    	int max,smax;
    	if(arr[0]>arr[1])
    	{
    		max=arr[0];smax=arr[1];
    	}
    	else
    	{
    		smax=arr[0];max=arr[1];
    	}
    	
    	for(int i=2;i<arr.length;i++)
    	{
    		if(max<=arr[i])
    		{   smax=max;
    			max=arr[i];
    		}
    		else if(max>arr[i]&&smax<=arr[i])
    		{
    			smax=arr[i];
    			
    		}
    	}
    	return smax;
    		
    
	
}}
