package EulerTest;
//1 ~ 10 ?‚¬?´?˜ ?–´?–¤ ?ˆ˜ë¡œë„ ?‚˜?ˆ„?–´ ?–¨?–´ì§??Š” ê°??¥ ?‘?? ?ˆ˜?Š” 2520?…?‹ˆ?‹¤.
//ê·¸ëŸ¬ë©? 1 ~ 20 ?‚¬?´?˜ ?–´?–¤ ?ˆ˜ë¡œë„ ?‚˜?ˆ„?–´ ?–¨?–´ì§??Š” ê°??¥ ?‘?? ?ˆ˜?Š” ?–¼ë§ˆì…?‹ˆê¹??
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
