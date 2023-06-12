package TryIt;
import java.util.*;
public class Day6_PatternAsses {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Number:");
		int a=s.nextInt();
		int c=97;
		for(int i=0;i<a;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print((char)(c+j)+" ");
			}
			System.out.println();
		}
	}
}
