package javatraining;
class Shape{

	void getArea() {
		System.out.println("Calculate the method");
		
	}
}
class Rectangles extends Shape{
	int breath=10;
	int height=20;
	void getArea() {
	int  area=breath*height;
	 System.out.println("Area of Rectangle:" +area);
	}
}
public class lab3C {
public static void main(String[]args) {
	Rectangles r=new Rectangles();
	r.getArea();
}
}
