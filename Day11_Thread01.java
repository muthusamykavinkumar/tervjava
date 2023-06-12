package TryIt;
class play{
	public void run(){
		for(int i=0;i<=5;i++) {
			System.out.println("Dhanush!");
			try {
				Thread.sleep(3000);
			}
			catch(Exception d){}
		}
	}
}
public class Day11_Thread01 {

	public static void main(String[] args) {
		play s=new play();
	}
}
