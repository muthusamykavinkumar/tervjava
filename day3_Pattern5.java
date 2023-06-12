package TryIt;
import java.util.*;
public class day3_Pattern5 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Number:");
		int a=s.nextInt();
		for(int i=0;i<a;i++) {
			for(int j=0;j<a;j++) {
				if(i==0||j==0||j==a-1||i==a/2) {
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
