package TryIt;
import java.util.*;
public class day3_MaxDigit {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Size:");
		int n=s.nextInt();
		System.out.println("Enter Value:");
		int a[][]=new int [n][n];
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				a[i][j]=s.nextInt();
			}
		}
		int max=0;
		for(int i=0;i<n;i++) {		
			for(int j=0;j<n;j++) {
				int c=0;
				System.out.print(a[i][j]+" ");
					c=a[i][j];
					if(c>max) {
						max=c;
					}
			}
			System.out.println();
		}
		System.out.println(max);
	}
}
