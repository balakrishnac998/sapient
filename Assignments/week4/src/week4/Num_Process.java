package week4;

public interface Num_Process {
 public abstract void intcal(int a,int b);
 
 public static void main(String []args)
 {  int a,b,choice;
 a=input.br.nextInt();
 b=input.br.nextInt();
 choice=input.br.nextInt();
 Num_Process ob[]=new Num_Process[4];
	 ob[0]=(int x,int y)->System.out.println(a+b);
	 ob[1]=(int x,int y)->System.out.println(x-y);
     ob[2]=(int x,int y)->System.out.println(x*y);
     ob[3]=(int x,int y)->System.out.println(x/y);
      ob[choice-1].intcal(a, b);
 }
}
