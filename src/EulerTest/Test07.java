package EulerTest;
//소수를 크기 순으로 나열하면 2, 3, 5, 7, 11, 13, ... 과 같이 됩니다.
//이 때 10,001번째의 소수를 구하세요.
public class Test07 {
	public static void main(String[] args) {
		int sosu = 0;
		int sosu_count = 0;
		for (int i = 2; ; i++) {
			if (check(i)) {
				sosu_count++;
				if (sosu_count == 10001) {
					sosu = i;
					break;
				}
			}
		}
		System.out.println(sosu);
	}
	
	public static boolean check(long n) {
		for (int i = 2; i <= Math.sqrt((double) n); i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}
	
}
