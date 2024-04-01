package method.quiz;

/* 
* 합을 구하는 함수 만들고 호출하세요.
* 두 수를 입력받아 n1부터 n2까지의 합을 반환하세요.
* 예시) 5,10 => 5+6+7+8+9+10
*/
public class Quiz3 {

	public static int duham(int n1, int n2) {
		int result = 0;
		for (int i = n1; i <= n2; i++) {
			result = result + i;
		}
		return result;
	}

	public static void main(String[] args) {
		int num1 = 5;

		int num2 = 10;

		int sum = duham(num1, num2);

		System.out.println(num1 + "+" + num2 + "=" + sum);
		

	}

}
