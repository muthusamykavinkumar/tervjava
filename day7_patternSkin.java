package TryIt;
import java.util.*;
public class day7_patternSkin {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Number:");
		int a=s.nextInt();
		for(int i=0;i<a;i++) {
			for(int j=0;j<a;j++) {
				if(i==0 || j==a-1 ||j==0 ||i==a-1) {
					System.out.print("1 ");
				}
				else {
					System.out.print("0 ");
				}
			}
			System.out.println();
		}
	}
}
