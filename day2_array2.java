package TryIt;
import java.util.*;
public class day2_array2 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter size:");
		int n=s.nextInt();
		System.out.println("Enter Value:");
		int a[]=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=s.nextInt();
		}
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				if(a[i]>a[j]) {
					a[i]=a[i]^a[j];
					a[j]=a[i]^a[j];
					a[i]=a[i]^a[j];		
				}
			}
		}
//		System.out.println(Arrays.toString(a));
		int t=1;
		for(int i=0;i<n;i++) {
			if(a[i]!=0) {
				if(a[i]==t) {
					t++;
				}
				else {
					System.out.println(t);
					break;
				}
			}
		}
	}
}
