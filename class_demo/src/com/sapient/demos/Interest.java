package com.sapient.demos;
import java.util.Scanner;
public class Interest {

public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter the amount");
  double amount= sc.nextDouble();
  System.out.println("Enter years");
  int years=sc.nextInt();
  System.out.println("Enter Rate of Interest");
  float rate=sc.nextFloat();
  sc.close();
  double simple = calcSimple(amount,years,rate);
  double compound = calcCompound(amount,years,rate);
  System.out.println("Simple interest : "+simple);
  System.out.println("Compound interest : "+compound);
	}
public static double calcSimple(double amount,int years,float rate){
	double si =amount*rate*years/100;
	return si;
}
public static double calcCompound(double amount,int years,float rate){
	double ci =amount*Math.pow((1+rate/100),years);
	return ci;
}	
	
}
