package TryIt;
import java.util.*;
public class day3_Pattern4 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Number:");
		int a=s.nextInt();
		int b=(2*a)-1;
		for(int i=0;i<b;i++) {
			for(int j=0;j<b;j++) {
				if(i==j||i+j==(a*2)-2) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}
