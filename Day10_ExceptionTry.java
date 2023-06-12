package TryIt;

public class Day10_ExceptionTry {

	public static void main(String[] args) {
		int a = 0;
		try {
			 a=5/1;
		}
		catch(ArithmeticException e) {
			System.out.println(e);
		}
		System.out.println("Welcome Terv");
		System.out.println(a);
	}
}
