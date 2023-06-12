package TryIt;
import java.util.*;
public class day3_Pattern3 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Number:");
		int c=s.nextInt(),b=c-1;
//		c=a*2-1
		for(int i=0;i<c;i++) {
			for(int j=0;j<c;j++) {
				if(i+j==b||j==b) {
					System.out.print("* ");
				}
				else if(b<i+j){
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}
