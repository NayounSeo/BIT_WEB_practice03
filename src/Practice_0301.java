
public class Practice_0301 {
	
	public static void main(String[] args) {
		int count = 0;
		int sum = 0;
		int[] data = {1,3,5,8,9,11,15,19,18,20,30,33,31};
		for (int d : data) {
			if ( d% 3 == 0) {
				count++; //�̰͵� �ñ׳����ΰ�...? 
				//0206�� ����� �̿��ؼ� ¥������ �̵� �غ��߰ڴ�.
				sum += d;
			}
		}
		System.out.println("�־��� �迭���� 3�� ����� ���� => "+count);
		System.out.println("�־��� �迭���� 3�� ����� �� => "+sum);
	}
	
}
