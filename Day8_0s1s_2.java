package TryIt;
import java.util.*;
public class Day8_0s1s_2 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Size:");
		int a=s.nextInt();
		System.out.println("Enter 0's And 1's:");
		int b[]=new int[a];
		for(int i=0;i<a;i++) {
			b[i]=s.nextInt();
		}
		int c0=0,c1=0;
		for(int i=0;i<a;i++) {
			if(b[i]==0) {
				c0++;
			}
			else {
				c1++;
			}
		}
			if(c0>c1) {
				for(int i=0;i<a;i++) {
				if(b[i]==1) {
					b[i]=0;
				}
				}
				System.out.println(c0);
				System.out.println(Arrays.toString(b));
			}
			else if(c0<c1) {
				for(int i=0;i<a;i++) {
				if(b[i]==0) {
					b[i]=1;
				}
				}
				System.out.println(c0);
				System.out.println(Arrays.toString(b));
			}
			else if(c0==c1) {
				for(int i=0;i<a;i++) {
				if(b[i]==0) {
					b[i]=1;
				}
				}
				System.out.println(c0);
				System.out.println(Arrays.toString(b));
		}
	}
}
// 