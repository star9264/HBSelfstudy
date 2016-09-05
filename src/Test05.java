//1 ~ 10 사이의 어떤 수로도 나누어 떨어지는 가장 작은 수는 2520입니다.
//그러면 1 ~ 20 사이의 어떤 수로도 나누어 떨어지는 가장 작은 수는 얼마입니까?
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
