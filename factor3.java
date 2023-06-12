package TryIt;
import java.util.*;
public class factor3 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter number:");
		int a=s.nextInt(),sum=0;
		for(int i=1;i<=a;i++) {
			if(a%i==0) {
				for(int j=1;j<=i;j++) {
					if(i%j==0) {
						sum+=j;
					}
				}
			}
		}
		System.out.println(sum);
	}
}
