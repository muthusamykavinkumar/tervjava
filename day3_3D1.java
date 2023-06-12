package TryIt;
import java.util.*;
public class day3_3D1 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Matrix Size:");
		int a=s.nextInt();
		System.out.println("Enter Row and Column Size:");
		int b=s.nextInt();
		int b1=s.nextInt();
		System.out.println("Enter Value:");
		int arr[][][]=new int[a][b][b1];
		for(int i=0;i<a;i++) {
			for(int j=0;j<b;j++) {
				for(int k=0;k<b1;k++) {
					arr[i][j][k]=s.nextInt();
				}
			}
		}
		for(int i=0;i<a;i++) {
			for(int j=0;j<b;j++) {
				for(int k=0;k<b1;k++) {
					System.out.print(arr[i][j][k]+" ");
				}
				System.out.println();
			}
			System.out.println();
		}
	}
}
