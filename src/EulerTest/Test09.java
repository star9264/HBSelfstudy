package EulerTest;
//�� �ڿ��� a, b, c �� ��Ÿ��� ���� a^2 + b^2 = c^2 �� �����ϸ� ��Ÿ��� ����� �θ��ϴ� (���⼭ a < b < c ).
//���� ��� 3^2 + 4^2 = 9 + 16 = 25 = 5^2�̹Ƿ� 3, 4, 5�� ��Ÿ��� ���Դϴ�.
//a + b + c = 1000  �� ��Ÿ��� �� a, b, c�� �� ���� ���Դϴ�. �� ��, a �� b �� c �� ���Դϱ�?

public class Test09 {
	public static void main(String[] args) {
		boolean result = false;
		for (int a = 1; a <=1000; a++) {
			for (int b = 1; b <=1000; b++) {
				int c = 1000-(a+b);
				if(a*a+b*b==c*c){
					result = true;
					System.out.println(a*b*c);
				}if(result) break;
			}if(result) break;
			
		}
		
		
	}

}
