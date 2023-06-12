package TryIt;
import java.util.*;
public class day3_3DTheter {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Row Column Size:");
		int a=s.nextInt();
		int b=s.nextInt();
		int arr[][][]=new int[a][b][b];
		for(int i=0;i<a;i++) {
			for(int j=0;j<b;j++) {
				for(int k=0;k<b;k++) {
					arr[i][j][k]=s.nextInt();
				}
			}
		}
		System.out.println("Enter The Screen Number:");
    	int x=s.nextInt();
    	System.out.println("Row : ");
    	int y=s.nextInt();
    	System.out.println("Seat : ");
    	int z=s.nextInt();
	}
}
