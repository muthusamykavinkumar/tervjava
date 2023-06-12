package TryIt;
import java.util.*;
public class Day5_Method1 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter The Number:");
		int a=s.nextInt();
		int c=0;
		for(int i=1;i<=a;i++) {
			if(a%i==0) {
				c+=add(i);
			}
		}
		System.out.println(c);
	}

	public static int add(int c) {
		int d=0;
		for(int i=1;i<=c;i++) {
			if(c%i==0) {
				d+=i;
			}
		}
		return d;
	}
}
