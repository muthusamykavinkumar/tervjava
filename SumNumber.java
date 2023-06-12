package TryIt;
import java.util.*;
public class SumNumber {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Number:");
		int a=s.nextInt(),c=0;
		while(a!=0) {
			int b=a%10;
			c+=b;
			a/=10;
		}
		System.out.println(c);
	}
}
