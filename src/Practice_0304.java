import java.util.Scanner;
public class Practice_0304 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int intArray[] = new int[5];
		double sum = 0;
		System.out.println("�ټ��� ���ڸ� �Է��ϼ��� : 10");
		for (int i = 0; i<5; i++) {
			intArray[i] = in.nextInt();
			sum += intArray[i]; 
		}
		System.out.println("�־��� ���ڵ��� ����� "+(double)sum/5+" �Դϴ�.");
	}
}
