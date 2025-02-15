package SwitchCase;

import java.util.Scanner;

public class Newton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Newton 1st Law :");
        
		Scanner squareroot=new Scanner(System.in);
		
        System.out.println("enetr the value of a :");
        int a=squareroot.nextInt();
        
        System.out.println("enter the value of b:");
        int b=squareroot.nextInt();
        
        double f=Math.pow(a, 2)+2*a*b+Math.pow(b, 2);
        
        System.out.println("squareroot :"+ f);
       
	}

}
