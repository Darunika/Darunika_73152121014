package javatraining;
import java.util.*;
import java.lang.Math;
public class Armstrong {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int temp=num;
		int count=0,lastdigit=0,rem;
		while (num > 0) 
			{
		      num /= 10;
		      ++count;
		    }
		num=temp;
		while(num!=0) 
		{
			   rem=num%10;
			   lastdigit+=Math.pow(rem, count);
			   num=num/10;
		}
	    if(temp==lastdigit) 
	    {
			   System.out.println("Amstrong Number");
		}
	    else 
	    {
			    System.out.println("Not a Amstrong Number");
		}
 }			
}
