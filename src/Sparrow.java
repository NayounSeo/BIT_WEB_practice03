
public class Sparrow extends Bird{

	public Sparrow(String name, int legs, int length) {
		super(name, 2, length);
	}
	public void fly() {
		System.out.println("����("+getName()+")�� ���ƴٴմϴ�.");
	}
	public String toString() {
		return "������ �̸��� "+getName()+" �Դϴ�.";
	}
	public void sing() {
		System.out.println("����("+getName() + ")�� �Ҹ����� ��ϴ�.");
	}
}

