package javatraining;

public class MethodOverloading {
	void myMethod(String name) {
		System.out.println("Hello"+name);
	}
	
	void myMethod(int a,int b) {
		System.out.println("Divide:" +(a/b));
	}
   
	void myMethod(int n) {
			System.out.println(+(n*n));
	}
	public static void main(String[]args) {
		MethodOverloading obj=new MethodOverloading();
		obj.myMethod("Darunika");
		obj.myMethod(10,20);
		obj.myMethod(50);
	}
}
