package TryIt;
import java.util.*;
public class day2_array4 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Size:");
		int a=s.nextInt();
		System.out.println("Enter Value:");
		int b[]=new int[a];
		for(int i=0;i<a;i++) {
			b[i]=s.nextInt();
		}
		for(int i=0;i<b.length;i++) {
			if(b[i]>10) {
				int c=0;
				while(b[i]!=0) {
					int a1=b[i]%10;
					c+=a1;
					b[i]/=10;
				}
				if(c>10) {
					while(c!=0) {
						
					}
				}
			}
		}
	}
}
