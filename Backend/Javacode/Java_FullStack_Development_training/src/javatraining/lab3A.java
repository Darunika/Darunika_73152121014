package javatraining;

class Animal {
    void makeSound() {
    	System.out.println("Makes Sound");
    }
}

class Cat extends Animal{
	void makeSound() {
		System.out.println("Bark");
	}
}
public class lab3A {
public static void main(String [] args) {
	Cat c=new Cat();
	Animal a=new Animal();
	c.makeSound();
	a.makeSound();
}
}
