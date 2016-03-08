
public class Swap {
	
	public static void main(String[] args) {
		int i1 = 10;
		int i2 = 20;
		//바뀌지 않는다 ^_^....
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
		//인스턴스는 생길지 안생길지 모르니 갖다 쓸 수 없다!
		//블럭 안에서의 변수들은 모두 스택에 박힌다!!!@@@@
		int temp = a;
		a = b;
		b = temp;
	}
	
	public static void swap2(Value a, Value b) {
		//--------------a
		Value tmp = a;
		a = b;
		b = tmp;
		//쓰면.... 주소 해쉬값 나온다...ㅜㅠㅜㅠㅜㅠㅜ (1과 a의 조합)
		//근데 왜 1과 b의 조합으로는 값이 안바뀌지???ㅜㅠㅜㅠ
		//객체의 직접대입....? 마찬가지로 Value tmp가 stack에 있었기 때문인가......ㅜㅠㅜㅠㅜㅠ
		//연지찡이 stack 이라고 합니다. 없어져 버린다고.
		//그냥 객체로 만들면 되는 것이 아니라, 함수를 사용하는 것이 포인트!@@@@@@@@@@@
		//-----------b
//		int tmp = a.getValue();
//		a.setValue(b.getValue());
//		b .setValue(tmp);		
	}

}
