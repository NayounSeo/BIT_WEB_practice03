
public class Swap {
	
	public static void main(String[] args) {
		int i1 = 10;
		int i2 = 20;
		//�ٲ��� �ʴ´� ^_^....
		swap(i1, i2);
		System.out.println(i1 + ", " + i2);
		
		Value v1 = new Value();
		Value v2 = new Value();
		v1.setValue(10);
		v2.setValue(20);  
		swap2(v1, v2);
		
//		System.out.println(v1 + ", " + v2); //-----------1
		System.out.println(v1.getValue() + ", " + v2.getValue()); //----------------2
		
	}
	
	public static void swap(int a, int b) {
		//�ν��Ͻ��� ������ �Ȼ����� �𸣴� ���� �� �� ����!
		//�� �ȿ����� �������� ��� ���ÿ� ������!!!@@@@
		int temp = a;
		a = b;
		b = temp;
	}
	
	public static void swap2(Value a, Value b) {
		//--------------a
		Value tmp = a;
		a = b;
		b = tmp;
		//����.... �ּ� �ؽ��� ���´�...�̤Ф̤Ф̤Ф� (1�� a�� ����)
		//�ٵ� �� 1�� b�� �������δ� ���� �ȹٲ���???�̤Ф̤�
		//��ü�� ��������....? ���������� Value tmp�� stack�� �־��� �����ΰ�......�̤Ф̤Ф̤�
		//�������� stack �̶�� �մϴ�. ������ �����ٰ�.
		//�׳� ��ü�� ����� �Ǵ� ���� �ƴ϶�, �Լ��� ����ϴ� ���� ����Ʈ!@@@@@@@@@@@
		//-----------b
//		int tmp = a.getValue();
//		a.setValue(b.getValue());
//		b .setValue(tmp);		
	}

}
