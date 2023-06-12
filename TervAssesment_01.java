package TryIt;
import java.util.*;
public class TervAssesment_01 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Number:");
		int a=s.nextInt();
		System.out.println("Enter Value:");
		int b[]=new int[a];
		for(int i=0;i<a;i++) {
			b[i]=s.nextInt();
		}
		int sum=0;
		for(int i=1;i<a;i++) {
			sum+=b[i];
		}
		if(sum>b[0]) {
			System.out.println(b[0]);
		}
		else {
			System.out.println(sum);
		}
	}
}
