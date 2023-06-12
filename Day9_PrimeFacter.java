package TryIt;
import java.util.*;
public class Day9_PrimeFacter {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Number:");
		int a=s.nextInt(),max=0;
		for(int i=1;i<=a;i++) {
			int c=0;
			if(a%i==0) {
				for(int j=2;j<=i;j++) {
					if(i%j==0) {
						c++;
					}
				}
				if(c==1) {
					if(i>max) {
						max=i;
					}
				}
			}
		}
		System.out.println(max);
	}
}