package EulerTest;
//?��?���? ?���? ?��?���? ?��?��?���? 2, 3, 5, 7, 11, 13, ... �? 같이 ?��?��?��.
//?�� ?�� 10,001번째?�� ?��?���? 구하?��?��.
public class Test07 {
	public static void main(String[] args) {
		int sosu_index=0;
		int su = 2; // 10001번째 ?��?���? 만날?�� 까�? 증�??��?�� ?��
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
