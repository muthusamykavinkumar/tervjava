package TryIt;
import java.util.*;
public class firstlast {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter number");
		int a=s.nextInt(),c=0,b=0;
		int x=a;
		while(a!=0) {
			a=a/10;
			c++;
		}
		b+=x%10;
		c=(int)Math.pow(10, c-1);
		b+=x/c;
		System.out.println(b);
	}
}
