package EulerTest;
//1 ~ 10 ?��?��?�� ?��?�� ?��로도 ?��?��?�� ?��?���??�� �??�� ?��?? ?��?�� 2520?��?��?��.
//그러�? 1 ~ 20 ?��?��?�� ?��?�� ?��로도 ?��?��?�� ?��?���??�� �??�� ?��?? ?��?�� ?��마입?���??
public class Test05 {
	public static void main(String[] args) {
		int num=1;
		int i=1;
		
		while(true){
			for (i = 1; i<21; i++) {
				if(num%i==0){
					continue;
				}else{
					num++;
					break;
				}
			}
			if(i==21){
				break;
			}
		}
		
		System.out.println(num);
	}
}
