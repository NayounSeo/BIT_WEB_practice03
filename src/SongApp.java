
public class SongApp {
	public static void main(String[] args) {
		Song s = new Song("아이유", "좋은날", "Real", 2010, 3, "이민수");
		s.show();
		Song s1 = new Song("트와이스", "OohAhh하게", "The Story Begins", 2015, 2, "이단옆차기");
		//int field에는 null 넣으면 안된다.. 걍 0
		Song s2 = new Song("프로듀스 101", "Pick Me", null, 2016, 0, null);
		Song s3 = new Song("마마무", "넌is뭔들");
		s1.show();
		s2.show();
		s3.show();
	}
}
