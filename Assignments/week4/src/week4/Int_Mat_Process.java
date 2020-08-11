package week4;

public class Int_Mat_Process {
int [][]mat;

    
	Int_Mat_Process()
	{
		mat=new int[3][3];
	}
	Int_Mat_Process(int m,int n)
	{
		mat=new int[m][n];
	}
	Int_Mat_Process(int [][] ob)
	{
		mat=ob;
	}
	Int_Mat_Process(Int_Mat_Process ob)
	{
		mat=ob.mat;
	}
	public void read()
	{
		for(int i=0;i<mat.length;i++)
		{
			for(int j=0;j<mat[i].length;j++)
			{
				mat[i][j]=input.br.nextInt();
				
			}
				
		}
	}
	public void disp()
	{
		for(int []row:mat)
		{
			for(int e:row)
			{
				System.out.print(e+" ");
			}
			System.out.println();
			
		}
	}
	public Int_Mat_Process sum(Int_Mat_Process ob) {
		Int_Mat_Process ans=new Int_Mat_Process(this.mat.length,this.mat[0].length);
		for(int i=0;i<mat.length;i++)
		{
			for(int j=0;j<mat[i].length;j++)
			{
				ans.mat[i][j]=this.mat[i][j]+ob.mat[i][j];
				
			}
				
		}return ans;
		
	}
	public String checkscalar()
	{
		if(mat.length==mat[0].length)
		{
			for(int i=0;i<mat.length;i++)
			{
				for(int j=0;j<mat[i].length;j++)
				{
					if(i!=j)
					{
						if(mat[i][j]!=0)
							return "not scalar";
					}
					else
					{
						if(mat[i][j]!=mat[0][0])return "not scalar";
					}
				}
			}
			return "scalar";
		}
		else
			return "not scalar";
	}
	public Int_Mat_Process mul(Int_Mat_Process ob)
	{
		Int_Mat_Process ans=new Int_Mat_Process(mat.length,ob.mat[0].length);
				
			     for(int i=0;i<mat.length;i++)
			     {
			    	 for(int j=0;j<mat[i].length;j++)
			    	 {
			    		 for(int k=0;k<ob.mat[0].length;k++)
			    		 {
			    			 ans.mat[i][j]+=mat[i][k]*ob.mat[k][j];
			    		 }
			    	 }
			     }
			     return ans;
				}
	
	
				
		
	
	
}
