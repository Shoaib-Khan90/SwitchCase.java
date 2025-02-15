package SwitchCase;
import java.util.Scanner;
public class cases {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
/*		Scanner percentage= new Scanner(System.in);
		
		System.out.println("enter the num of cs:");
		int cs=percentage.nextInt();
		
		System.out.println("enter the num of bs:");
		int bs=percentage.nextInt();
		
		System.out.println("enter the num of es:");
		int es=percentage.nextInt();
		
		double obtained=cs+bs+es;
		
		double total=300;
		
		double f=(obtained/total)*100;
		
		System.out.println("percentage :"+f);
		
		if(f>=90) {
			System.out.println("your grade is A plus");
		}
		else if(f>=80) {
			System.out.println("your grade is A:");
		}
		else  {
			System.out.println("your fail");
		}*/
		
		
/*		Scanner averagemarks=new Scanner (System.in);
		int a=55;
		int b=60;
		int c=a+b;
		double sum=a+b;
		double divide=200;
		double f=sum/divide;
		System.out.println("averagemarks :"+f);
		*/
		
		
/*		Scanner input=new Scanner (System.in);
		System.out.println("enter the per:");
		double per=input.nextDouble();
		if(per>=90){
			System.out.println("your 5 points of bonus");
		}else if(per>=80){
			System.out.println("your grade is A");
		}else if(per>=70) {
			System.out.println("your grade is B");
			}else {
			System.out.println("your grade is C");
	}
		*/
		
		////////////////////////////////////////////////////////
		Scanner input=new Scanner(System.in);
		System.out.println("enter the num");
		int grade=input.nextInt();
		switch(grade){
		case 1:
			System.out.println("A");
			break;
		case 2:
			System.out.println("B");
			break;
		case 3:
			System.out.println("C");
			break;
		case 4:
			System.out.println("D");
			break;
			default:
				System.out.println("E");
		}
	}
}

