package javatraining;
class Employeem {
	void work() {
		System.out.println("Employee Works");
	}
	
	void getSalary() {
		System.out.println("To Get Salary");
	}
}
class HRManager extends Employeem{
	void work() {
		System.out.println("HR Works");
	}
	
	void addEmployee() {
		System.out.println("Employee Added");
	}
}
public class lab3D {
	public static void main(String[] args) {
		HRManager m=new HRManager();
		Employeem n=new Employeem();
		m.work();
		m.addEmployee();
		m.getSalary();
		
		n.work();
		n.getSalary();
	}

}
