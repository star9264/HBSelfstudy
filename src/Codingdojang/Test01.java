package Codingdojang;
//1~1000에서 각 숫자의 개수 구하기 10 => 1 , 0 
public class Test01 {
	public static void main(String[] args) {
		int[] result = new int[10];
		int a = 0; //일의자리수
		int b = 0;// 십의자리수
		int c = 0;//백의자리수
		for (int i = 1; i <=1000; i++) {
			if(i<10){
				result[i]+=1;
			}else if(i<100){
				a = i%10;
				b = (i-a)/10;
				result[a]+=1;
				result[b]+=1;
			}else if(i<1000){
				a = i%10;
				c = i/100;
				b = (i-c*100-a)/10;
				result[a]+=1;
				result[b]+=1;
				result[c]+=1;
			}else{
				result[0]+=3;
				result[1]+=1;
			}
		}
		for (int i = 0; i < result.length; i++) {
			System.out.println(i+"는 " +result[i]+"개");
		}
	}
}
