
public class Practice0307_Prob7 {
	public static void main(String[] args) {
		Duck duck = new Duck("²Ð²ÐÀÌ", 2, 50);
		Sparrow sparrow = new Sparrow("Â±Â±",2, 10);
		duck.fly();
		duck.sing();
		System.out.println(duck.toString());
		sparrow.fly();
		sparrow.sing();
		System.out.println(sparrow.toString());
	}

}
