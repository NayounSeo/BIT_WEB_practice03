import java.util.Scanner;
public class Practice_0304 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int intArray[] = new int[5];
		double sum = 0;
		System.out.println("다섯개 숫자를 입력하세요 : 10");
		for (int i = 0; i<5; i++) {
			intArray[i] = in.nextInt();
			sum += intArray[i]; 
		}
		System.out.println("주어진 숫자들의 평균은 "+(double)sum/5+" 입니다.");
	}
}
