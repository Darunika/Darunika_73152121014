package javatraining;

public class Methods {
	void myMethod() {
		System.out.println("Instance Method");
	}
	
	static void myMethod2() {
		System.out.println("Static Method");
	}
	public static  void main(String[]args) {
		Methods obj1=new Methods();
		obj1.myMethod();
		
		Methods.myMethod2();
	}
}
