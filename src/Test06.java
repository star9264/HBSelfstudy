//1부터 10까지 자연수를 각각 제곱해 더하면 다음과 같습니다 (제곱의 합).
//1^2 + 2^2 + ... + 10^2 = 385
//1부터 10을 먼저 더한 다음에 그 결과를 제곱하면 다음과 같습니다 (합의 제곱).
//(1 + 2 + ... + 10)^2 = 552 = 3025
//따라서 1부터 10까지 자연수에 대해 "합의 제곱"과 "제곱의 합" 의 차이는 3025 - 385 = 2640 이 됩니다.
//그러면 1부터 100까지 자연수에 대해 "합의 제곱"과 "제곱의 합"의 차이는 얼마입니까?
public class Test06 {
	public static void main(String[] args) {
		int sum_squre=0; //제곱의 합
		int sum_hap = 0; //합의 제곱
		int result = 0;
		for (int i = 1; i <=100; i++) {
			sum_squre+=i*i;
			sum_hap+=i;
			
			if(i==100){
			
			result = sum_hap*sum_hap-sum_squre;
			break;
			}
		
		}
		System.out.println(result);
		
	}
}
