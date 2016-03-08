import java.util.Scanner;
public class Practice_0302 {
	public static void main(String[] args) {
		int money = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("금액을 입력하세요 : ");
		money = scanner.nextInt();
		howMuch(money);
	}
	
	public static void howMuch(int money) {
		int unit = 50000;
		//이것도 쓰고 나니까 너무 기네.... 
		while(money > 0) {
			money -= calculating(money, unit)*unit;
			unit = 10000;
			money -= calculating(money, unit)*unit;
			unit = 5000;
			money -= calculating(money, unit)*unit;
			unit = 1000;
			money -= calculating(money, unit)*unit;
			unit = 500;
			money -= calculating(money, unit)*unit;
			unit = 100;
			money -= calculating(money, unit)*unit;
			unit = 50;
			money -= calculating(money, unit)*unit;
			unit = 10;
			money -= calculating(money, unit)*unit;
			unit = 1;
			money -= calculating(money, unit)*unit;
		}
	}
	
	public static int calculating(int money, int unit) {
		int count = 0;
		if (money>unit) {
			count = money/unit;
			System.out.println(unit+" 원권(동전) : \t"+count+"매(개)");
		}
		return count;
	}
}
