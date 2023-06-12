package TryIt;
import java.util.*;
public class factor4 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter 1st Number:");
		int a=s.nextInt(),a1=0;
		System.out.println("Enter 2nd Number:");
		int b=s.nextInt(),b1=0;
		for(int i=1;i<a;i++) {
			if(a%i==0) {
				a1+=i;
			}
		}
//		System.out.println(a1);
		for(int i=1;i<b;i++) {
			if(b%i==0) {
				b1+=i;
			}
		}
//		System.out.println(b1);
		if(a1==b&&b1==a) {
			System.out.println("yes!");
		}
		else {
			System.out.println("No");
		}
	}
}
