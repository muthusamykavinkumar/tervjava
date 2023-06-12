package TryIt;
import java.util.*;
public class Dhanush_2nd_Large {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Size");
		int a=s.nextInt();
		int b[]=new int[a];
		for(int i=0;i<a;i++) {
			b[i]=s.nextInt();
		}
		int max=0,t=0;
		for(int i=0;i<a;i++) {
				if(b[i]>max) {
					t=max;
					max=b[i];
				}
			}
		System.out.println(t);
	}
}
