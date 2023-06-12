package TryIt;
import java.util.*;
public class Day9_StringCount {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Number");
		String a=s.nextLine();
		char b[]=a.toCharArray();
		int sum=0,n=0;
		for(int i=0;i<b.length;i++) {
			sum+=b[i]-'0';
			System.out.print(b[i]+" ");
		}
		n++;
		System.out.print(sum+" ");
		int n1=sum;
		System.out.println("N1"+n1);
		for(int i=n;i<b.length;i++) {
			sum+=b[i]-'0';
		}
		n++;
		System.out.print(sum+" ");
		int n2=sum;
		System.out.println("N2"+n2);
		for(int i=n;i<b.length;i++) {
			sum+=b[i];
		}
		sum+=n1;
		System.out.print(sum+" ");
		System.out.println(n);
	}
}
