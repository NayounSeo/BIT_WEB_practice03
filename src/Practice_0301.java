
public class Practice_0301 {
	
	public static void main(String[] args) {
		int count = 0;
		int sum = 0;
		int[] data = {1,3,5,8,9,11,15,19,18,20,30,33,31};
		for (int d : data) {
			if ( d% 3 == 0) {
				count++; //이것도 시그네쳐인가...? 
				//0206은 상속을 이용해서 짜보래네 이따 해봐야겠다.
				sum += d;
			}
		}
		System.out.println("주어진 배열에서 3의 배수의 개수 => "+count);
		System.out.println("주어진 배열에서 3의 배수의 합 => "+sum);
	}
	
}
