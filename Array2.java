package TryIt;
import java.util.*;
public class Array2 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter Size");
		int a=s.nextInt();
		System.out.println("Enter Value:");
		int b[]=new int[a];
		for(int i=0;i<a;i++) {
			b[i]=s.nextInt();
		}
		int c=0,d=0;
		for(int i=0;i<a;i++) {
			if(b[i]%2==0) {
				c+=b[i];
			}
			else {
				d+=b[i];
			}
		}
		System.out.println(d-c);
	}
}
