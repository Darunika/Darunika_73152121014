package javatraining;
class Rectangle{
	int width;
	int height;
	float area;
	float perimeter;

	Rectangle(int width,int height){
		this.width=width;
		this.height=height;
	}
	 void calculatearea(){
		 area=width*height;
	 }
	 
	 void claculateperimeter() {
		 perimeter=2*(width+height);
		 
	 }
	void display() {
		System.out.println("Area:"+area);
		System.out.println("Perimeter"+perimeter);
	}
	
}
public class lab2C {
	public static void main(String []args) {
		Rectangle obj1=new Rectangle(4,2);
		obj1.calculatearea();
		obj1.claculateperimeter();
		obj1.display();
		
	}
}
