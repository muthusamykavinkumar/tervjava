package TryIt;
import java.util.*;
public class Day9_StringRotation {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter String:");
		String a=s.nextLine();
		System.out.println("Enter Rotation Number:");
		int n=s.nextInt();
		for(int i=a.length()-n;i<a.length();i++) {
			System.out.print(a.charAt(i));
		}
		for(int i=0;i<a.length()-n;i++) {
			System.out.print(a.charAt(i));
		}
	}
}