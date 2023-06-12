package TryIt;
import java.util.*;
public class day3_Pattern2 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Numer:");
		int b=s.nextInt();
		int a=(2*b)-1;
		for(int i=1;i<=a;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
}
