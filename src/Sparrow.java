
public class Sparrow extends Bird{

	public Sparrow(String name, int length) {
		super(name, length);
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

