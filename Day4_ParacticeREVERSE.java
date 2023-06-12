package TryIt;
import java.util.*;
public class Day4_ParacticeREVERSE {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter String:");
		String a=s.nextLine();
		char b[]=a.toCharArray();
		int l=a.length();
		char t;
		for(int i=0,j=l-1  ;i<j;  i++,j--) {
			while(!((b[i]>=65  &&  b[i]<=90) || (b[i]<=122  &&  b[i]>=97))) {
				i++;
			}
			while(!((b[j]>=65  &&  b[j]<=90 ) || (b[j]>=97  &&  b[j]<=122))) {
				j--;
			}
			t=b[i];
			b[i]=b[j];
			b[j]=t;
		}
		for(int i=0;i<b.length;i++) {
			System.out.print(b[i]);
		}
	}
}
