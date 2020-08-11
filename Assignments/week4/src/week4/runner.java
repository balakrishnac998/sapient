package week4;

public class runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Int_Arr_Process ob1=new Int_Arr_Process(8) ;
  Int_Arr_Process ob2=new Int_Arr_Process() ;
  int []demo= {1,2,3,4};
  Int_Arr_Process ob3=new Int_Arr_Process(demo) ;
  Int_Arr_Process ob4=new Int_Arr_Process(ob3) ;
  ob1.read();
  ob1.dispv();
  ob1.disph();
  ob1.sort();
  ob1.disph();
  System.out.println(ob1.max());
  System.out.println(ob1.min());
  System.out.println(ob1.sum());
  System.out.println(ob1.secmax());
  Int_Mat_Process ob5=new Int_Mat_Process();
  Int_Mat_Process ob6=new Int_Mat_Process();
  ob5.read();
  ob6.read();
  Int_Mat_Process ob7=new Int_Mat_Process(ob5.sum(ob6));
  ob7.disp();
  System.out.println(ob7.checkscalar());System.out.println(ob6.checkscalar());
  Int_Mat_Process ob8=new Int_Mat_Process(ob5.mul(ob6));
  ob8.disp();
	}

}
