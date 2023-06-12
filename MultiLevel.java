package TryIt;
class food extends lunch{
	void pongal() {
		System.out.println("Pongal is Tiffen for Morning!\n");
	}
}
class lunch extends break1{
	void sambar() {
		System.out.println("Sambar Satham And Vatai is Lunch for Hostel boys!\n");
	}
}
class break1 extends diner{
	void tea() {
		System.out.println("Hostel Manegement give's Tea & Bun in After 4.45!\n");
	}
}
class diner extends after{
	void poori() {
		System.out.println("Hostel Management give's Only Two Poori in Diner!\n");
	}
}
class after extends leave{
	void training() {
		System.out.println("After Diner Go Lab And Learn The Java!\n");
	}
}
class leave{
	void leave() {
		System.out.println("After 11 Go And Sleep!\n");
	}
}
public class MultiLevel {

	public static void main(String[] args) {
		food a=new food();
		a.pongal();
		a.sambar();
		a.tea();
		a.poori();
		a.training();
		a.leave();
	}
}
