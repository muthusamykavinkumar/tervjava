package TryIt;
import java.util.*;
public class Array3 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Size:");
		int n=s.nextInt();
		System.out.println("Enter Value:");
		int a[]=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=s.nextInt();
		}
		int t=0;
		for(int i=0;i<n-1;i++){		
			if(a[i]>a[i+1]) {
				t=a[i];
			}
		}
		System.out.println(t);
	}
}
