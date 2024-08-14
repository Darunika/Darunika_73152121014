package javatraining;
class C {
	C(){
		super();
		System.out.println("C");
	}
	C(int c){
		
		System.out.println("c1");
	}
}
class D extends C {
	D(){
		super(5);
		System.out.println("D");
	}
	D(int a){
		System.out.println("d1");
	}
}
public class Invocation {
	public static void main(String[]args) {
		D d=new D(5);

	}
}
