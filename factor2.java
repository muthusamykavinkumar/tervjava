package TryIt;
import java.util.*;
public class factor2 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Number:");
		int a=s.nextInt(),sum=0;
		for(int i=1;i<a;i++) {
			if(a%i==0) {
				sum+=i;
			}
		}
		if(sum==a) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
	}
}
