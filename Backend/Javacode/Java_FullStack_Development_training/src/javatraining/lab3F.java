package javatraining;
class Animals{
	void move() {
		System.out.println("Animal Moves");
	}
}
class Cheetah extends Animals{
	void move() {
		System.out.println("Cheetah runs");
	}
}
public class lab3F {
public static void main(String[]args) {
	Cheetah h=new Cheetah();
	h.move();
	Animals v=new Animals();
	v.move();
}
}
