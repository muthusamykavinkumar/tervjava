package TryIt;
import java.util.*;
public class am {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter number:");
		int a=s.nextInt(),c=0,sum=0;
		int t=a;
		int y=a;
		while(a!=0) {
			a=a/10;
			c++;
		}
		while(t!=0) {
			int r=t%10;
			int b=(int)Math.pow(r, c);
			sum+=b;
			c--;
			t/=10;
		}
		if(sum==y) {
			System.out.println(true);
		}
		else {
			System.out.println(false);
		}
	}
}
