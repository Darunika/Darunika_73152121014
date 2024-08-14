package javatraining;

public class ConstructorOL {
	ConstructorOL(String name) {
		System.out.println("Hello " +name+ "!");
	}
	
	ConstructorOL(int a,int b) {
		this("Darunika");
		System.out.println("Divide:" +(a/b));
	}
   
	ConstructorOL(int n) {
		    this(122,78);
			System.out.println(+(n*n));
	}
	
	public static void main(String[]args) {
		ConstructorOL  obj=new ConstructorOL(100);
	}
}
