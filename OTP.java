package TryIt;
import java.util.*;
public class OTP {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Name:");
		String n=s.nextLine(),c="";
		System.out.println("Enter Account Type:");
		String a=s.nextLine();
		System.out.println("Enter Account Number:");
		String b=s.nextLine();		
		c+=n.charAt(0);
		c+=n.charAt(1);
		c+=b.charAt(0);
		String b1[]=b.split("");
		int d[]=new int[5],d1=0;
		for(int i=0;i<5;i++) {
			 d1+=Integer.parseInt(b1[i]);
			c+=d1;
		}
		System.out.println(c);
	}
}
