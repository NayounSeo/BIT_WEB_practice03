
public class Practice_0303 {
	public static void main(String args[]) {
		char[] array1 = reverse("Hello World");
		printCharArray(array1);
		char[] array2 = reverse("Java Programming!");
		printCharArray(array2);
		
	}
	
	public static char[] reverse(String str){
		//���� ���� new ����!!!
		char[] tmpch = new char[str.length()];
		for(int i = 0; i<str.length(); i++) {
			tmpch[i] = str.charAt(str.length() - i - 1);
		}
		return tmpch;
		//enhanced for loop ��� �Ұ�. �̰� �迭�� ���ؼ��� �Ǵ°ſ���.. ���� ¯¯��!
		//��� str.charAt(int index) �Լ��� ����ߴ�. 
	}
	
	public static void printCharArray(char[] array){
		System.out.println(array);
	}
	
//		static void reverse(char a[]) {
//			for(int i=0; i<Math.floor(a.length/2); i++) {
//				char temp = a[i];
//				a[i] = a[a.length-i-1];
//				a[a.length-i-1] = temp;
//			}
//		}

}
