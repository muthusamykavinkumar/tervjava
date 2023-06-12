package TryIt;
import java.util.*;
public class Array1 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter size");
		int n=s.nextInt();
		System.out.println("Enter Value:");
		int a[]=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=s.nextInt();
		}
		int b=0,c=0;
		for(int i=0;i<n;i++) {
			if(i%2!=0) {
				b+=a[i];
			}
			else {
				c+=a[i];
			}
		}
		int v=c-b;
		System.out.println(v);
	}
}
