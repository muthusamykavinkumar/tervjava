package TryIt;
import java.util.*;
public class ecc {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Number");
		int a=s.nextInt(),n=0;
		if(a%9==0) {
			for(int i=1;i<1000000000;i++) {
				if(9*i==a) {
					n=i;
				}
			}
			for(int i=0;i<n;i++) {
				System.out.print("9");
			}
		}
		if(a%9!=0) {
			int c=a%9;
			int c1=a-c;
			System.out.print(c);
			for(int i=1;i<1000000000;i++) {
				if(i*9==c1) {
					n=i;
				}
			}
			for(int i=0;i<n;i++) {
				System.out.print("9");
			}
		}
	}
} 

// 