package javatraining;
import java.util.*;
class Employees{
	String name;
	String jobtitle;
	int  salary;

	
	Employees(String name,String jobtitle,int salary){
		this.name=name;
		this.jobtitle=jobtitle;
		this.salary=salary;
	}
	void calculate() {
		
	    salary*=12;
	}
	void update() {
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter the amount: ");
        double increment = sc.nextDouble();
        salary += increment;
        //System.out.println("Updated salary: " + salary);
	}
	
	void display() {
		System.out.println("Name" +name);
		System.out.println("Jobtitle"+jobtitle);
		System.out.println("Salary:"+salary);
	}
}
public class lab2F {
	public static void main(String[]args) {
		Employees obj1=new Employees("Daunika","Manager",6000);
		 
	      obj1.calculate();
	      obj1.display();
	      obj1.update(); 
	      obj1.display();
	      

		
	}
}
