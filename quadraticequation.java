package SwitchCase;
import java.util.Scanner;
public class quadraticequation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				Scanner x=new Scanner(System.in);
		System.out.println(" Quadratic equation:");
		System.out.println("enter the value of a");
		int a=x.nextInt();
		System.out.println("enter the value of b");
		int b=x.nextInt();
		System.out.println("enter the value of c");
		int c=x.nextInt();
		double d=b*b - 4 * a * c ;
		if(d>0) {
			double r1=(-b+Math.pow(d, 0.5))/(2*a);
			double r2=(-b-Math.pow(d, 0.5))/(2*a);
			System.out.println("the roots are" +r1 + "and" +r2);
		}
		else if(d==0) {
			double r1=-b/(2*a);
			System.out.println("the root is r1:"+r1);
		}
		else {
			System.out.println("the root are not real:");
		}
	}

}
