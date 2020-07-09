import java.util.Scanner;

public class Bj_2775 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		// 테스트케이스 갯수
		int n = sc.nextInt();
		
		// 각 호수 별 정원값을 저장
		int[] temparr = new int[n];
		
		for(int i = 0 ; i < n ; i ++) {
			temparr[i] = personnel(sc.nextInt(), sc.nextInt());
		}
		
		for(int i = 0; i < n ; i++) {
			System.out.println(temparr[i]);
		}
		
		sc.close();

	}
	
	public static int personnel(int a, int b) {
		
		int answer;
		
		// 0층 호수 별 인원은 호수와 같다
		if(a == 0) {
			answer = b;
		// 각 층별 1호 인원은 1명으로 고정되어 있다
		} else if(b == 1) {
			answer = 1;
		} else {
			answer = personnel(a, b-1) + personnel(a-1, b);
		}
		
		return answer;
	}

}