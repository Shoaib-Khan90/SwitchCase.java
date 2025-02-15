package SwitchCase;

import java.util.Scanner;

public class days {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("class 12 switch statement:");
		System.out.println("enetr your day");
		int day=input.nextInt();
		switch(day) {
		case 1:			System.out.println("monday");
		break;
		case 2:
			System.out.println("tuesday");
			break;
		case 3:
			System.out.println("wednesday");
			break;
		case 4:
			System.out.println("thursday");
			break;
		case 5:
			System.out.println("friday");
			break;
		default:
			System.out.println("unknown day");		
  	}
	}

}
