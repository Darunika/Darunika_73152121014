package javatraining;
import java.util.*;
public class Prime {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int temp=1;
		for(int i=2;i<=a;i++) {
			if(a%2==0) {
				temp=temp+1;
			}
		}
		if(temp<=2) {
			System.out.println("Prime");
		}
		else {
			System.out.println("Not a prime");
		}
	}
}
