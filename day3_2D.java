package TryIt;
import java.util.*;
public class day3_2D {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Row Colunm Size:");
		int r=s.nextInt();
		int c=s.nextInt();
		System.out.println("1st Value:");
		int a[][]=new int [r][c];
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				a[i][j]=s.nextInt();
			}
		}
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}   
		
		System.out.println("2st Value:");
		int b[][]=new int [r][c];
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				b[i][j]=s.nextInt();
			}
		}
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				System.out.print(b[i][j]+" ");
			}
			System.out.println();
		}int c1=0,c2=0;
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				c1+=a[i][j];
				c2+=b[i][j];
			}
		}
		if(c1>c2) {
			int c3=c1-c2;
			System.out.println(c3);
		}
		else {
			int c3=c2-c1;
			System.out.println(c3);
		}
	}
}
//0 4 5 6 7 8 9 10 11
//0 2 3 4 5 6 7 8 8
