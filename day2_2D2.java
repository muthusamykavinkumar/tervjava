package TryIt;
import java.util.*;
public class day2_2D2 {

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
		}
		int odd=0,even=0;
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				if(j%2==0) {
					even+=a[i][j];
				}
				else {
					odd+=a[i][j];
				}
			}
			int min=odd-even;
			if(min==0||min==11) {
				System.out.println("Yes!");
			}
			else {
				System.out.println("No!");
			}
			odd=0;
			even=0;
		}
	}
}
//1 3 7 5 2 4 3 2 6 2 5 9