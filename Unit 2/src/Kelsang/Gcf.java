package Kelsang;

import java.util.Scanner;

public class Gcf {

	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter your first number");
		int number1=sc.nextInt();
		System.out.println("Please enter your second number");
		int number2=sc.nextInt();
		System.out.println("The greatest common factor of these two numbers is " +gcf(number1,number2));		
	}
	
	public static int gcf(int number1, int number2){
		if(number1>number2){
			for(int i =number1; i>0;i--){
				if(isDivisible(number1, i)==true&& isDivisible(number2, i)==true){
					return i;
				}
			}
		}
	
	if (number2>number1){
		for(int i= number2;i>0;){
			if(isDivisible(number2,i)==true&&isDivisible(number1,i)==true){
				
			}
			return i;
		}
		
	}
	
	
	return number1;
	}
	public static boolean isDivisible(int x, int y){
		if(x%y==0){
			return true;
		}
		return false;
	}
}
	
	

	
