package TryIt;
import java.util.*;
public class Day8_0s1s {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Size");
		int a=s.nextInt();
		System.out.println("Enter Value 0's And 1's:");
		int b[]=new int[a];
		for(int i=0;i<a;i++) {
			b[i]=s.nextInt();
		}
		int c=0;
		for(int i=0;i<a;i++) {
			if(b[i]==0) {
				c++;
			}
		}
		System.out.println(c);
	}
}
