
public class SongApp {
	public static void main(String[] args) {
		Song s = new Song("������", "������", "Real", 2010, 3, "�̹μ�");
		s.show();
		Song s1 = new Song("Ʈ���̽�", "OohAhh�ϰ�", "The Story Begins", 2015, 2, "�̴ܿ�����");
		//int field���� null ������ �ȵȴ�.. �� 0
		Song s2 = new Song("���εེ 101", "Pick Me", null, 2016, 0, null);
		Song s3 = new Song("������", "��is����");
		s1.show();
		s2.show();
		s3.show();
	}
}
