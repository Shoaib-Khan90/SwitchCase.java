package SwitchCase;
import java.util.Scanner;
public class Newtonlaws {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Newton 3rd law :");
		Scanner S=new Scanner(System.in);
		System.out.println("enter the value of vi:");
		int vi=S.nextInt();
		System.out.println("enter the value of a:");
		int a=S.nextInt();
		System.out.println("enter the value of t:");
		int t=S.nextInt();
		double f=vi+0.5*a*t;
		System.out.println("S :"+ f);
	}

}
