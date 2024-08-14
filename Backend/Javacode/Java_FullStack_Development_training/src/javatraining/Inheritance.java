package javatraining;
class Vehicle{
	void noOfEngine() {
		System.out.println("I have one Engine");
	}
}
class TwoWheeler extends Vehicle{
	void noOfWheel() {
		System.out.println("Two Wheeler");
	}
}
class Bike extends TwoWheeler{
	void BrandName() {
		System.out.println("Honda");
	}
}
class Scooty extends TwoWheeler{
	void brandName() {
		System.out.println("Activa");
	}
}
public class Inheritance {
	public static void main(String[]args) {
		Bike bike=new Bike();
		bike.noOfEngine();
		bike.noOfWheel();
		bike.BrandName();
		
		
		Scooty scooty=new Scooty();
		scooty.noOfEngine();
		scooty.noOfWheel();
		scooty.brandName();
		
	}
}
