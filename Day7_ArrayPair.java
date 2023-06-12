package TryIt;
import java.util.*;
public class Day7_ArrayPair {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Size");
		int n=s.nextInt();
		int a[]=new int[n];
		int f[]=new int[55];
		for(int i=0;i<n;i++) {
			a[i]=s.nextInt();
			f[a[i]]++;
		}
		int c=0;
		for(int i=0;i<55;i++) {
			c+=f[i]/2;
		}
		System.out.println(c);
		System.out.println(Arrays.toString(f));
	}
}
//10 20 20 10 50 10 30 20 30 10
