package SwitchCase;

import java.util.Scanner;

public class electricity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner electricity=new Scanner (System.in);
		System.out.println("enter the cus num :");
		int cn=electricity.nextInt();
		System.out.println("enter the cus name :");
		String cname=electricity.next();
		System.out.println("enter the current reading :");
		double cr=electricity.nextDouble();
		System.out.println("enter the final reading :");
		double fr=electricity.nextDouble();
		double billdifference=fr-cr;
		System.out.println("electricity "+ billdifference);
		
		if(billdifference>=100 && billdifference<=200) {
			System.out.println("enter the 'd' in domastic"+"enter the 'c' in commercial :");
			char input=electricity.next().charAt(0);
			
			switch(input) {
			case 'd':
				double domastic=billdifference * 2;
				System.out.println("cus num :"+cn);
				System.out.println("cus name :"+ cname);
				System.out.println("electricity :"+ domastic);
				System.out.println("the bill is paid :");
				
			case 'c':
				double commercial= billdifference * 4;
				System.out.println("cus num :"+cn);
				System.out.println("cus name :"+ cname);
				System.out.println("electricity :"+ commercial);
				System.out.println("the bill is paid :");
				
			}
		}
		
		else if(billdifference >=201 && billdifference <= 500) {
			System.out.println("enter the 'd' in domastic"+"enter the 'c' in commercial :");
			char input=electricity.next().charAt(0);
			
			switch(input) {
			case 'd':
				double domastic=billdifference * 4;
				System.out.println("cus num :"+cn);
				System.out.println("cus name :"+ cname);
				System.out.println("electricity :"+ domastic);
				System.out.println("the bill is paid :");
				
			case 'c':
				double commercial= billdifference * 6;
				System.out.println("cus num :"+cn);
				System.out.println("cus name :"+ cname);
				System.out.println("electricity :"+ commercial);
				System.out.println("the bill is paid :");
			}
		}
		
		else {
			System.out.println("enter the 'd' in domastic"+"enter the 'c' in commercial :");
			char input=electricity.next().charAt(0);
			
			switch(input) {
			case 'd':
				double domastic=billdifference * 6;
				System.out.println("cus num :"+cn);
				System.out.println("cus name :"+ cname);
				System.out.println("electricity :"+ domastic);
				System.out.println("the bill is paid :");
				
			case 'c':
				double commercial= billdifference * 8;
				System.out.println("cus num :"+cn);
				System.out.println("cus name :"+ cname);
				System.out.println("electricity :"+ commercial);
				System.out.println("the bill is paid :");
			}
		}
	}

}
