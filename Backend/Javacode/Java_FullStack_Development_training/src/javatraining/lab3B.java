package javatraining;
class Vehicles{
	void drive() {
		System.out.println("Driving the car");
	}
}
class Car extends Vehicle{
	void drive() {
		System.out.println("Repairing a car");
	}
}
public class lab3B {
public static void main(String[]args) {
	Car c=new Car();
	Vehicles v=new Vehicles();
	c.drive();
	v.drive();
}
}
