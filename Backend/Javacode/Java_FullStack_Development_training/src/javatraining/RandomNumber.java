package javatraining;
import java.util.*;
import java.lang.Math;
public class RandomNumber {
	public static void main(String[]args) {
	    Random value=new Random();
		System.out.println("Number1:" +value.nextInt(25));
		System.out.println("Number2:" +value.nextInt(1000));
	}
}
