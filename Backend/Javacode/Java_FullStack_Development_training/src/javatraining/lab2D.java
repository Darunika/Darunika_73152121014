package javatraining;
class Circle{
	int radius;
	float pi=3.14f;
	float area;
	float circumference;
	
	Circle(int radius){
		this .radius=radius;
	}
	
	void calculatearea() {
		area=pi*radius*radius;
		
	}
	void calculateperimeter() {
		circumference=2*pi*radius*radius;
	}
	void display() {
		System.out.println("Area:"+area);
		System.out.println("Circumference:"+circumference);
	}
	public void setdata(float circumference) {
		this.circumference=circumference;
	}
	
}
public class lab2D {
	public static void main(String[] args) {
		Circle obj1=new Circle(4);
		obj1.calculatearea();
		obj1.calculateperimeter();
		obj1.setdata(4.16f);
		obj1.display();
		
	}
}
