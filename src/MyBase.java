
public class MyBase extends Base {
	//�������̵�.....?
	public void service(String state) {
		if(state.equals("��")) {
			System.out.println("������ ������ ������!");
		} else if (state.equals("����")) {
			System.out.println("���ĵ� ���� ���������� ���ؾ� �մϴ�");
		} else {
			super.service("��");
		}
	}
}
