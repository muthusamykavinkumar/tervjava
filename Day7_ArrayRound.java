package TryIt;
import java.util.*;
public class Day7_ArrayRound {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Size");
		int a=s.nextInt();
		int b[]=new int[a];
		System.out.println("Enter Value:");
		for(int i=0;i<a;i++) {
			b[i]=s.nextInt();
		}
		for(int i=0;i<a;i++) {
			int c=0,v=0,v1=0;
			if(b[i]>=38) {
					if(b[i]%5==0) {
						System.out.print(b[i]+" ");
					}
					else {
						 c=b[i]%5;
						 v=c+1;
						 v1=c+2;
						if(v%5==0) {
							int k=1;
							k+=b[i];
							System.out.print(k+" ");
						}
						else if(v1%5==0) {
							int k=2;
							k+=b[i];
							System.out.print(k+" ");
						}
						else {
							System.out.print(b[i]+" ");
						}
					}
				}
			else {
				System.out.print(b[i]+" ");
			}
		}
	}
}
