package TryIt;
import java.util.*;
public class Day8_OpenClose {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
//		System.out.println("Enter Size");
//		int a=s.nextInt();
//		int b[]=new int[10];
//		for(int i=1;i<=a;i++) {
//			if(i==1) {
//				b[i]=1;
//			}
//		}
		int c=0;
		char a=s.next().charAt(0);
		String b=s.next();
		for(int i=0;i<b.length();i++) {
			if(b.charAt(i)==a) {
				c++;
			}
		}
		System.out.println(c);
	}
}
