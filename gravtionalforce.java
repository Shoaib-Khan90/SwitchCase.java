package SwitchCase;
import java.util.Scanner;
public class gravtionalforce {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				System.out.println(" Gravtional force:");
		Scanner F=new Scanner (System.in);
		System.out.println("enter the value of m1");
		int m1=F.nextInt();
		System.out.println("enter the value of m2 ");
		int m2=F.nextInt();
		System.out.println("enter the value of r");
		int r=F.nextInt();
		double d=6.67*Math.pow(10, -11)*m1*m2/Math.pow(r, 2);
		System.out.println("F="+d);
	}

}
