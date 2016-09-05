package EulerTest;
//?†Œ?ˆ˜ë¥? ?¬ê¸? ?ˆœ?œ¼ë¡? ?‚˜?—´?•˜ë©? 2, 3, 5, 7, 11, 13, ... ê³? ê°™ì´ ?©?‹ˆ?‹¤.
//?´ ?•Œ 10,001ë²ˆì§¸?˜ ?†Œ?ˆ˜ë¥? êµ¬í•˜?„¸?š”.
public class Test07 {
	public static void main(String[] args) {
		int sosu_index=0;
		int su = 2; // 10001ë²ˆì§¸ ?†Œ?ˆ˜ë¥? ë§Œë‚ ?•Œ ê¹Œì? ì¦ê??‹œ?‚¬ ?ˆ˜
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
