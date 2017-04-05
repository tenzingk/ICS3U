package Kelsang;

import java.util.Scanner;

public class IsPrime {

	public static void main(String[]args){
		System.out.print("Enter a number");
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();
		if(prime(number)==true){
			System.out.println("The number you entered is a prime number");
		}
		else if(prime(number)==false){
			System.out.println("The number you entered is not a prime number");
		}
	}
	public static boolean isDivisible(int x, int y){
		if(x%y==0){
			return true;
		}
		return false;
		}
	
	
	
	public static boolean prime(int num){
		for(int i=2;i<num/2;i++){
			if(num%i==0){
				return false;
		}
			
	}
	

		
	return true;
	}
}
	

