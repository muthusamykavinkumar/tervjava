package TryIt;
import java.util.*;
class lee{
	void dhanush(int a,int b,int c) {
		if(a>b && a>c ) {
			System.out.println("Maximum Number Is = "+a);
		}
		else if(b>a && b>c) {
			System.out.println("Maximum Number is = "+b);
		}
		else if(c>a && c>b) {
			System.out.println("Maximum Number is = "+c);
		}
	}
	void dhanush(String a,String b,String c) {
		if(c.charAt(0)=='A') {
			System.out.println(c+" = 2013007");
		}
		if(b.charAt(0)=='D') {
			System.out.println(b+" = 2013018");
		}
		if(a.charAt(0)=='L') {
			System.out.println(a+" = 2013056");
		}
	}
}
public class Day8_OverLoad {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		lee s=new lee();
		System.out.println("Enter Number:");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		s.dhanush(a, b, c);
//		System.out.println();
		s.dhanush("Lingesh Prabhu", "Dhanush", "Aswinth");
	}
}
