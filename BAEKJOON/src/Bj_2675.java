import java.util.Scanner;

public class Bj_2675 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 테스트케이스 갯수
		int n = sc.nextInt();
			
		String[] answer = new String[n];
		
		for(int i = 0 ; i < n ; i++) {
			answer[i] = repeatCharacter(sc.nextInt(), sc.next());
		}
		
		for(int i = 0 ; i < n ; i++) {
			System.out.println(answer[i]);
		}
		
		sc.close();
	}
	
	public static String repeatCharacter(int n, String x) {
		
		String answer = "";
		
		for(int i = 0 ; i < x.length() ; i++) {
			
			for(int j = 0 ; j < n ; j++) {
				
				answer += x.charAt(i);
			}
		}
		
		return answer;
	}
}