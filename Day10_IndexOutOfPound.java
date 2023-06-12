package TryIt;

public class Day10_IndexOutOfPound {

	public static void main(String[] args) {
		try {
			int a[]=new int[5];
			a[10]=30;
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		System.out.println("Hello");
	}
}
