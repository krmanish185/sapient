package com.sapient.demos;
import java.util.Scanner;
public class EnumDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first value");
		int v1=sc.nextInt();
		System.out.println("Enter second value");
		int v2=sc.nextInt();
        System.out.println("Choose 1-- ADD\n 2-- Substract\n 3-- Multiply\n");
        String str=sc.next();
        sc.close();
        try{
        Menu menu = Menu.valueOf(str.toUpperCase());
        System.out.println("invalid menu option");
        
        switch(menu){
        case ADD:
        	System.out.println("Add "+ (v1+v2));
        	break;
        case SUB:
        	System.out.println("Subtract "+(v1-v2));
        	break;
        case MULTIPLY:
        	System.out.println("Multiply "+(v1*v2));
        	break;
       
        }
	}catch(Exception exp){
		System.out.println("invalid option");
	}

	}
}


enum Menu{
	ADD, SUB, MULTIPLY
}
