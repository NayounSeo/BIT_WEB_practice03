
public class Practice0307_Prob7 {
	public static void main(String[] args) {
		Duck duck = new Duck("�в���", 2, 50);
		Sparrow sparrow = new Sparrow("±±",2, 10);
		duck.fly();
		duck.sing();
		System.out.println(duck.toString());
		sparrow.fly();
		sparrow.sing();
		System.out.println(sparrow.toString());
	}

}
