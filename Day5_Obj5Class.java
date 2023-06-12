package TryIt;
	class m1 {
		int a;
		String c;
		double b;
	
	public m1(int i, String st, double d) {
		a=i;
		c=st;
		b=d;
	}
	void display() {
	System.out.println("RegNo = "+a+" : Name = "+c+" : CGPA = "+b);
	}
	}
//	------------------------------------------------------------------
	class m2 {
		int a;
		String c;
		double b;
	
	public m2(int i, String st, double d) {
		a=i;
		c=st;
		b=d;
	}
	void display() {
	System.out.println("RegNo = "+a+" : Name = "+c+" : CGPA = "+b);
	}
	}
//	-------------------------------------------------------------------------
	class m3 {
		int a;
		String c;
		double b;
	public m3(int i, String st, double d) {
		a=i;
		c=st;
		b=d;
	}
	void display() {
	System.out.println("RegNo = "+a+" : Name = "+c+" : CGPA = "+b);
	}
	}
//-----------------------------------------------------------------------------	
	class m4 {
		int a;
		String c;
		double b;
	public m4(int i, String st, double d) {
		a=i;
		c=st;
		b=d;
	}
	void display() {
	System.out.println("RegNo = "+a+" : Name = "+c+" : CGPA = "+b);
	}
	}
//	------------------------------------------------------------------------------
	class m5 {
		int a;
		String c;
		double b;
	public m5(int i, String st, double d) {
		a=i;
		c=st;
		b=d;
	}
	void display() {
	System.out.println("RegNo = "+a+" : Name = "+c+" : CGPA = "+b);
	}
	}
public class Day5_Obj5Class {		
	public static void main(String[] args) {
		m1 n =new m1(1,"Lingesh",9.99);
		n.display();
		m2 n1 =new m2(1,"Lingesh",9.99);
		n1.display();
		m3 n2 =new m3(1,"Lingesh",9.99);
		n2.display();
		m4 n3 =new m4(1,"Lingesh",9.99);
		n3.display();
		m5 n4 =new m5(1,"Lingesh",9.99);
		n4.display();
	}
}

