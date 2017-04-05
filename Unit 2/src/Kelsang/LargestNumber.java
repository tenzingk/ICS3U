package Kelsang;

import java.util.Scanner;

public class LargestNumber {
	
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("How many numbers would you like to enter?");
		int numbers= sc.nextInt();
		int maxNum[]=new int [numbers];
		System.out.println("Please enter your numbers");
		for(int i=0;i<numbers;i++)
			maxNum[i]=sc.nextInt();
		System.out.println("The largest number entered is " +n(maxNum));
		
	}
	public static int n(int[]numbers){
		int maxNum=numbers[0];
		for(int i=1;i<numbers.length;i++){
			maxNum=Math.max(maxNum,numbers[i]);
		}
		return maxNum;
		}
	}


