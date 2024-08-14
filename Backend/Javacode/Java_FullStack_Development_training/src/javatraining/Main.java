package javatraining;
import java.util.*;
class Employee {
	//Variable
	int employeeId;
	String  employeeName;
	float employeeSalary;
	
	//constructor 
	Employee(int employeeId,String employeeName,float employeeSalary){
		this.employeeId=employeeId;
		this.employeeName=employeeName;
		this.employeeSalary=employeeSalary;
	}
	//Method
	void display() {
		System.out.println("EmployeeId:"+employeeId);
		System.out.println("EmployeeName:"+employeeName);
		System.out.println("EmployeeSalary:"+employeeSalary);
	}
}
public class Main {
	public static void main(String[]args) {
		Employee employee=new Employee(101,"Darunika",3000.0f);
		employee.display();

	}
}
