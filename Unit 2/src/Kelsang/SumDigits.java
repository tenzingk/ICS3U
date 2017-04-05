package Kelsang;

import java.util.Scanner;

public class SumDigits {

	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter a number");
		int n=sc.nextInt();
		System.out.println("The sum of your numbers digits is " +digits(n));
	}
	
	public static int digits(int n){
		int sum=0;
		while(n>0){
			sum=sum+ n%10;
			n=n/10;
			
			
			
		}
			return sum;	
		
	}
}
