package Kelsang;

import java.util.Scanner;

public class Factorial {
	
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter a number");
		int a=sc.nextInt();
		System.out.println("The factorial of the number is " +factorial(a));
				
				
		
	}
	
	
	
	
	public static int factorial(int a){
		for(int b=a-1;b>0;b--){
			a=a*b;
		}
			return a;
		
		
	}

}
