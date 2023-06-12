package TryIt;
import java.util.*;
public class check {
	public static int gcd(int a,int b) {
		if(a==0)
		return b;
		else
		return gcd(b%a,a);
	}

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
	     int a=in.nextInt();
	     int b=in.nextInt();
	     System.out.println( gcd(a,b));
	}

}
