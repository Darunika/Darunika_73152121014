package javatraining;
class Person {
	String name;
	int age;
	
	Person(String name,int age){
		this.name=name;
		this.age=age;
	}
	
	void display() {
		System.out.println("Name:"+name);
		System.out.println("Age:"+age);
	}
}
public class lab2A {
	public static void main(String[]args) {
		Person obj=new Person("Darunika",20);
		obj.display();
		Person obj1=new Person("Hari",21);
		obj1.display();
		
	}

}
