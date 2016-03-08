
public class Duck extends Bird {
	public Duck(String name,  int legs, int length) {
		super(name, 2, length);
	}
	public void fly() {
		System.out.println("����("+getName() + "�� ���� �ʽ��ϴ�.");
	}
	public void sing() {
		System.out.println("����("+getName() + ")�� �Ҹ����� ��ϴ�.");
	}
	public String toString() {
		return "������ �̸��� "+getName()+" �Դϴ�.";
	}
}
