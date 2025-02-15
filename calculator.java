package SwitchCase;

import java.util.Scanner;

public class calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner calculator=new Scanner(System.in);
		
		System.out.println("enter the one operators(+,-,/,*,%)=");
		
		char operators= calculator. next().charAt(0);
		
		System.out.println("enter the first num:");
		
		double firstnum=calculator.nextDouble();
		
		System.out.println("enter the second num:");
		
		double secondnum=calculator.nextDouble();
		
		switch(operators) {
		case '+':
			System.out.println("addition: " + (firstnum+secondnum));
			break;
			
		case '-':
			System.out.println("subtraction: "+(firstnum-secondnum));
			break;
			
		case '/':
			System.out.println("division: "+ (firstnum/secondnum));
			break;
			
		case '*':
			System.out.println("multiplication: "+ (firstnum*secondnum));
			break;
			
		case '%':
			System.out.println("modoulas: "+ (firstnum%secondnum));
			break;
			
		}

	}

}
