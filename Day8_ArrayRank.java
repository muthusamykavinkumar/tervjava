package TryIt;
import java.util.*;
public class Day8_ArrayRank {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter 1st Size");
		int a=s.nextInt();
		System.out.println("Enter 1st Value");
		int a1[]=new int[a];
		for(int i=0;i<a;i++) {
			a1[i]=s.nextInt();
		}
		System.out.println("Enter 2nd Size");
		int b=s.nextInt();
		System.out.println("Enter 2nd Value");
		int b1[]=new int[b];
		for(int i=0;i<b;i++) {
			b1[i]=s.nextInt();
		}
		Arrays.sort(a1);
		int o=0;
		int c[]=new int[a];
		for(int i=a-1;i>=0;i--) {
			c[o]=a1[i];
			o++;
		}
		for(int i=0;i<b;i++) {
			int y=1;
			for(int j=0;j<a;j++) {
				if(b1[i]>=c[j]) {
					y+=j;
					System.out.print(y+" ");
					break;
				}
			}
		}
//		System.out.println(Arrays.toString(c));
	}
}
//67 56 31 11 9 8 4 3