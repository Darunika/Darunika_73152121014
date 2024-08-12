import java.util.Scanner;
public class Main{
public static void main(String [] args){
	int employeeId;
	String employeeName;
	float employeeSalary;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the employee id:");
	employeeId=sc.nextInt();
	System.out.println("Enter the employee name:");
	employeeName=sc.next();
	System.out.println("Enter the employee salary:");
	employeeSalary=sc.nextInt();
	System.out.println("Employee Id:"+employeeId);
	System.out.println("Employee Name:"+employeeName);
	System.out.println("Employee salary:"+employeeSalary);
}
}

	


	