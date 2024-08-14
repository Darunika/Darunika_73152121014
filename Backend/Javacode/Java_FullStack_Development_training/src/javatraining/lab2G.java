package javatraining;
import java.util.*;
class Account
{
	String holdername;
	String accountnum;
	double deposit;
	double withdraw;
   void addvalues()
   {
	  Scanner sc=new Scanner(System.in);
	  accountnum=sc.nextLine();
	  holdername=sc.nextLine();  
	  deposit=sc.nextDouble();
	  withdraw=sc.nextDouble();
	  
   }
   void display()
   {
	   System.out.println("Account  holders name:"+holdername);
		  System.out.println("Account number:"+accountnum);
		  System.out.println("Deposit amount:"+deposit);
		  System.out.println("Withdraw amount:"+withdraw);
   }
 void delete(double withdraw)
 {
	 this.withdraw=withdraw;
 } 
 }
public class lab2G {
	public static void main(String[] args)
	   {
		   Account obj=new Account();
		   obj.addvalues();
		   obj.display();
		   Account obj2=new Account();
		   obj2.addvalues();
		   System.out.println("To set null value to deposit:");
		   obj2.delete(0);
		   obj2.display();   
	   }
}
