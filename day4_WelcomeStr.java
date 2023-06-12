package TryIt;
import java.util.*;
public class day4_WelcomeStr {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter String:");
		String a=s.nextLine();
		System.out.println("Enter char:");
		char b=s.next().charAt(0);
		char c[]=a.toCharArray();
		for(int i=0;i<c.length;i++) {
			if(c[i]==b) {
				System.out.println(i+1);
				break;
			}
		}
	}
}
