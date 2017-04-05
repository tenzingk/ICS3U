package Kelsang;

import hsa_new.Console;

public class HelloConsole {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Console c = new Console();
		int age;
		c.println("Enter your age ");
		age=c.readInt();
		c.println("Your age is: " + age);
		age = age + 10;
		c.println("10 years from now you will be " +age);
		
	}

}
