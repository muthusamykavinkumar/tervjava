package TryIt;
import java.util.*;
public class day3_2D1 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter row column size:");
		int r=s.nextInt();
		int c=s.nextInt();
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
		}int max=0;
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				if(a[i][j]<0) {
				if(a[i][j]<0) {
					max=a[i][j];
				}
			  }
				else {
					if(a[i][j]>0) {
						max=a[i][j];
					}
				}
		   }
		}
		if(max<0) {
			System.out.println(max);
		}
		else {
			System.out.println(max*-1);
		}
	}
}
//-3 -4 -5 -6 -7 -8 -9 -10 -11
//3 4 5 6 7 8 9 10 11