package javatraining;
import java.util.*;
class student{
	int reg_No;
	String stu_Name;
	int arr[]=new int[5];
	int sum=0;
	int average;
	String grade;
	
	student(int reg_No,String stu_Name) {
		this.reg_No=reg_No;
		this.stu_Name=stu_Name;
	}
	
	 void GetMarks() {
		 Scanner sc=new Scanner(System.in);
		 for(int i=0;i<5;i++) {
			 arr[i]=sc.nextInt();
		 }
	 }
	 void CalculateGrade() {
		 for(int i=0;i<5;i++) {
		 sum=arr[i]+sum;
	 }
		 average=sum/5;
		 if(average>=90) {
			grade="O";
		 }
		 else if(average>=80) {
			 grade="A";
		 }
		 else if(average>=70) {
			 grade="B";
		 }
		 else if(average>=50) {
			 grade="c";
		 }
		 else {
			 grade="F";
		 }
	 }
	 void DisplayReport() {
		 System.out.println("Register No: "+reg_No);
		 System.out.println("Name: "+stu_Name);
		 System.out.println("Sum: "+sum);
		 System.out.println("Average: "+average);
		 System.out.println("Grade: "+grade);
		 
	 }
	
}
public class GradeCalculation {
	public static void main(String[]args) {
		Scanner s=new Scanner(System.in);
		student obj1=new student(14,"Darunika");
		obj1.GetMarks();
		obj1.CalculateGrade();
		obj1.DisplayReport();
		
	}

}
