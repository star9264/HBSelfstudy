package EulerTest;
//1 ~ 10 ?¬?΄? ?΄?€ ?λ‘λ ???΄ ?¨?΄μ§?? κ°??₯ ??? ?? 2520???€.
//κ·Έλ¬λ©? 1 ~ 20 ?¬?΄? ?΄?€ ?λ‘λ ???΄ ?¨?΄μ§?? κ°??₯ ??? ?? ?Όλ§μ?κΉ??
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
