package com.sapient.demos;

import java.util.Scanner;
public class area {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the radius of circle");
		float radius=sc.nextFloat();
		sc.close();
		
		System.out.println("Area of circle : "+ circleArea(radius));
		System.out.println("Perimeter of circle : "+ circlePerimeter(radius));

	}
 
	public static double circleArea(float r){
		double a=Math.PI*Math.pow(r, 2);
		return a;
	}
	public static double circlePerimeter(float r){
		double p=2*Math.PI*r;
		return p;
	}
}
