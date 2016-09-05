//소수를 크기 순으로 나열하면 2, 3, 5, 7, 11, 13, ... 과 같이 됩니다.
//이 때 10,001번째의 소수를 구하세요.
public class Test07 {
	public static void main(String[] args) {
		int sosu_index=0;
		int su = 2; // 10001번째 소수를 만날때 까지 증가시킬 수
		int sosu_count=0;
		for (int i = 1; i <=su; i++) {
			if(su%i==0){
				for (int j = 1; j <=su; j++) {
					if(su%2==0){
						sosu_count++;
					}
				}
				if(sosu_count==2){
					sosu_index++;
				}
				else continue;
			}
			su++;
		}
		if(sosu_index==10001){
			System.out.println(su);
		}
		
		
		
	}
}
