package TryIt;
import java.util.*;
public class day4_String1 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter String:");
		String a=s.nextLine();
		String v="aeiouAEIOU";
		for(int i=0;i<a.length();i++) {
			for(int j=0;j<v.length();j++) {
				if(a.charAt(i)==v.charAt(j)) {
					System.out.print(a.charAt(i)+" ");
				}
			}
		}
	}
}
