package TryIt;
import java.util.*;
public class day2_array3 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Size:");
		int n=s.nextInt();
		System.out.println("Enter value:");
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
		int c=0,c1=0;
		for(int i=0;i<n;i++) {
			if(a[i]<0) {
				c++;
			}
			else if(a[i]>0){
				c1++;
			}			
		}
		System.out.println(c*c1+c+c1);
	}
}
//3 8 0 -1 -4