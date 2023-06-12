package TryIt;
import java.util.*;
public class Day4_Single {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Size:");
		int a=s.nextInt();
		System.out.println("Enter Value:");
		int b[]=new int[a];
		for(int i=0;i<a;i++) {
			b[i]=s.nextInt();
		}
		for(int i=0;i<a;i++) {
			if(b[i]%9!=1||b[i]%9!=4||b[i]%9!=0) {
				System.out.print(b[i]+" ");
			}
		}
	}
}
