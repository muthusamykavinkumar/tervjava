package TryIt;
import java.util.*;
public class day3_2DSneak {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter  Size:");
		int n=s.nextInt();
		System.out.println("Enter Value:");
		int a[][]=new int [n][n];
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				a[i][j]=s.nextInt();
			}
		}
		for(int i=0;i<n;i++) {
			if(i%2==0) {
				for(int j=0;j<n;j++) {
					System.out.print(a[i][j]+" ");
				}				
			}
			else {
				for(int j=n-1;j>=0;j--) {
					System.out.print(a[i][j]+" ");
				}
			}
		}
	}
}
//1 2 3
//6 5 4
//7 8 9