package arithmetic;

import java.util.Scanner;

public class fig_words {
	/*static String fig_to_words(long number)
	{
		int first_dig=(int) (number%10);
		number=number/10;
		int second_dig=(int) (number%10);
		number=number/10;
		int third_dig=(int) (number%10);
		number=number/10;
		int fourth_dig=(int) (number%10);
		number=number/10;
		String words="";
		switch(fourth_dig)
		{
		case 1: words=words+"one thousand ";break;
		case 2: words=words+"two thousand ";break;
		case 3: words=words+"three thousand ";break;
		case 4: words=words+"four thousand ";break;
		case 5: words=words+"five thousand ";break;
		case 6: words=words+"six thousand ";break;
		case 7: words=words+"seven thousand ";break;
		case 8: words=words+"eight thousand ";break;
		case 9: words=words+"nine thousand ";break;
		
		
		}
		switch(third_dig)
		{
		case 1: words=words+"one hundred ";break;
		case 2: words=words+"two hundred ";break;
		case 3: words=words+"three hundred ";break;
		case 4: words=words+"four hundred ";break;
		case 5: words=words+"five hundred ";break;
		case 6: words=words+"six hundred ";break;
		case 7: words=words+"seven hundred ";break;
		case 8: words=words+"eight hundred ";break;
		case 9: words=words+"nine hundred ";break;
		
		
		}
		boolean cond=false;
		switch(second_dig)
		{
		case 1: cond=true;
			switch(first_dig)
			{
			case 1:words=words+"eleven";break;
			case 2:words=words+"twelve";break;
			case 3:words=words+"thirteen";break;
			case 4:words=words+"fourteen";break;
			case 5:words=words+"fifteen";break;
			case 6:words=words+"sixteen";break;
			case 7:words=words+"seventeen";break;
			case 8:words=words+"eighteen";break;
			case 9:words=words+"nineteen";break;
			
			}break;
		case 2:  words=words+"twenty ";break;
			
		case 3: words=words+"thirty ";break;
		
		case 4: words=words+"fourty ";break;
		case 5: words=words+"fifty  ";break;
		case 6: words=words+"sixty ";break;
		case 7: words=words+"seventy ";break;
		case 8: words=words+"eighty ";break;
		case 9: words=words+"ninety ";break;
		
		
		}
		if(!cond)
		{
			switch(first_dig)
			{
			case 1:  words=words+"one";break;
			case 2:  words=words+"two";break;
			
			case 3: words=words+"three";break;
			
			case 4: words=words+"four";break;
			case 5: words=words+"five ";break;
			case 6: words=words+"six";break;
			case 7: words=words+"seven";break;
			case 8: words=words+"eight";break;
			case 9: words=words+"nine";break;
			}
		}
		
		return words;
	}
*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter amount");
		long amount;
		Scanner scanner=new Scanner(System.in);
		amount=scanner.nextLong();
		String []unitdig= {"","one","two","three","four","five","six","seven","eight","nine","ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen"};
		String []others= {"twenty","thirty","fourty","fifty","sixty","seventy","eighty","ninety"};
		String[] diff= {"crores","lakhs","thousand","hundred"};
		int [] l= {10000000,100000,1000,100};
		String words="";
		for(int i=0;i<4;i++)
		{
			if((amount/l[i])!=0)
			{
				long rem= amount/l[i];
				
			    if(rem<=19)
			    {
			    	words+=unitdig[(int) rem]+diff[i];
			    	
			    }else
			    {
			    	words+=others[(int) (rem/10-2)]+unitdig[(int) (rem%10)]+diff[i];
			    }
				amount=amount%l[i];
			}
			
		}
		if(amount<=19)
	    {
	    	words+=unitdig[(int)amount];
	    	
	    }else
	    {
	    	words+=others[(int) (amount/10-2)]+unitdig[(int) (amount%10)];
	    }
		
		System.out.println(words);
		
		
		
		
	
		
		
	}

}
