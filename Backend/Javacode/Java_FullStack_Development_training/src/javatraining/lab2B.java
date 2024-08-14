package javatraining;
class Dog{
	String name;
	String breed;
	 
	Dog(String name,String breed){
		this.name=name;
		this.breed=breed;
	}
	void display() {
		System.out.println("Name"+name);
		System.out.println("Breed"+breed);
	}
	public void breed(String breed) {
		this.breed=breed;
	}
}
public class lab2B {
	public static void main(String[]args) {
		Dog obj1=new Dog("Somu","Golden Rtriever");
		Dog obj2=new Dog("Charlie","BullDog");
		obj1.display();
//		obj2.display();
		obj2.breed("Labrador");
		obj2.display();
	}
}
