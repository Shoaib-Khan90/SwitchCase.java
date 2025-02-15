package SwitchCase;
import java.util.Scanner;
public class Newtonlaw {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Newton 2nd law :");
		
		Scanner vf=new Scanner(System.in);
		
		System.out.println("enetr the value of vi:");
		int vi=vf.nextInt();
		
		System.out.println("enter the value of a:");
		int a=vf.nextInt();
		
		System.out.println("enter the value of t:");
		int t=vf.nextInt();
		
		double f=vi+a*Math.pow(t, 2);
		
		System.out.println("vf :"+ f);
	}

}
