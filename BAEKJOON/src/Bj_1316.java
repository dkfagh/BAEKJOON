import java.util.ArrayList;
import java.util.Scanner;

public class Bj_1316 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		// 그룹단어의 갯수
		int count = 0;
		
		for(int i = 0 ; i < n ; i++) {
			if(isGroupChar(sc.next())) {
				count++;
			}
		}
		
		System.out.println(count);		
		
		sc.close();

	}
	
	public static boolean isGroupChar(String x) {
				
		boolean flag = true;
		
		// 입력받은 단어를 한 글자씩 저장할 AraryList 생성
		ArrayList<Character> temparr = new ArrayList<>();
				
		// 주어진 문자열의 첫번째 글자
		char c = x.charAt(0);
		// 첫번째 문자를 temparr에 저장
		temparr.add(c);
		
		for(int i = 1 ; i < x.length() ; i++) {
			// 다음 글자가 이전 글자와 같을 경우
			if(c == x.charAt(i)) {
				continue;
			// 다음 글자가 이전 글자와 다를 경우
			} else {
				// 다음 글자가 이미 temparr에 존재할 경우 -> 그룹단어가 아님
				if(temparr.contains(x.charAt(i))) {
					flag = false;
				} else {
					temparr.add(x.charAt(i));
					c = x.charAt(i);
				}
			}
		}
		
		return flag;
	}

}