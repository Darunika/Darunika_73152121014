package javatraining;
import java.util.*;
public class Palindrome {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int r=0,a;
		int temp=n;
		while(n!=0) {
			a=n%10;
			r=r*10+a;
			n=n/10;
		}
		if(r==temp) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not a palindrome ");
		}
	}
}
