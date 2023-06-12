package TryIt;
import java.util.*;
public class day4_StrAppend {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("1st String:");
		String a=s.nextLine();
//		System.out.println("2nd String:");
//		String b=s.nextLine();
//		System.out.println(a+b);
		String c="";
		char d[]=a.toCharArray();
//		for(int i=0;i<a.length();i++) {
//			c+=a.charAt(i);
//		}
		for(int i=0;i<a.length();i++) {
			c+=d[i];
		}
		System.out.println(c);
//		System.out.println(a.length());
	}
}
