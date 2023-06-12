package TryIt;
import java.util.*;
public class day3_Pattern1 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Number:");
		int a=s.nextInt();
		int t=(a*2)-1;
		for(int i=0;i<t;i++) {
			for(int j=0;j<t;j++) {
				if(i==0||j==0||j==t-1||i==t-1) {
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
