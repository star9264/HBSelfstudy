import java.util.List;


public class Test03 {
	public static void main(String[] args) {
		final long SU = 600851475143L;
		long max = 1;
		for (long i = 1; i <=SU; i++) {
			if(SU%i==0){
				long j = SU/i;
				if(sosu_confirm(i)&&sosu_confirm(j)){
					if(max<i) max=i;
					if(max<j) max=j;
				}
				
			}
		}
		
		System.out.println(max);
		
	}
	
	public static boolean sosu_confirm(long num){
		System.out.println("sosu_confirm");
		System.out.println(num);
		boolean result = false;
		int sosu_count = 0;
		for (long i = 1; i <=num; i++) {
			if(num%i==0){
				sosu_count++;
			}
			if(sosu_count==2) result=true;
			else result = false;
		}
		return result;
	}


}
