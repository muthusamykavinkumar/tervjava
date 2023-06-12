package TryIt;
class ksr extends Thread{
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println("Dhanush");
		
		try {
			Thread.sleep(5000);
		}
		catch(Exception d) {}
		}
	}
}
public class Day10_Thread {

	public static void main(String[] args) {
		ksr s=new ksr();
		s.start();
	}
}
