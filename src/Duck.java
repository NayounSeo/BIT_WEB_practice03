
public class Duck extends Bird {
	public Duck(String name,  int length) {
		super(name, length);
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
