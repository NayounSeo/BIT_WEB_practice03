
public class MyBase extends Base {
	//오버라이딩.....?
	public void service(String state) {
		if(state.equals("낮")) {
			System.out.println("낮에는 열심히 일하자!");
		} else if (state.equals("오후")) {
			System.out.println("오후도 낮과 마찬가지로 일해야 합니다");
		} else {
			super.service("밤");
		}
	}
}
