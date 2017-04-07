package Kelsang;

import java.util.Scanner;

public class Sentence {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[]args){
	
    System.out.println("Write something ");
	
	String[]sentence=sc.nextLine().split(" ");
	for(int i=0;i<sentence.length;i++){
		for(int j=sentence[i].length()-1;j>=0;j--){
			System.out.print(sentence[i].charAt(j));
		}
		System.out.print(" ");
		}

	}
	
	}


