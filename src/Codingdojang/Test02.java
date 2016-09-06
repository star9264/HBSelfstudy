package Codingdojang;
//10~1000까지 각 숫자 분해하여 곱하기의 전체 합 구하기
public class Test02 {
	public static void main(String[] args) {
		int mux = 1;
		int total_sum = 0;
		int a = 0; // 일의 자리수
		int b = 0; // 십의 자리수
		int c = 0; // 백의 자리수
		
		for (int i = 10; i <=1000; i++) {
				if(i<100){
					a = i%10;
					b = (i-a)/10;
					mux = a*b;
					total_sum+=mux;
				}else if(i<1000){
					c = i/100;
					b = (i-c*100)/10;
					a = i-(100*c+10*b);
					mux = a*b*c;
					total_sum+=mux;
				}
				System.out.println(i+": "+mux);	
			}
		System.out.println(total_sum);
	}

}
