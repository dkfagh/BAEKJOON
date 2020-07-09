import java.util.Scanner;

public class Bj_1065 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		
		int count = 0;
		
		// 1보다 크거나 같고 입력받은 수(x)보다 작거나 같은 수 중 한수인 수의 갯수 세기
		for(int i = 1 ; i <= x ; i++) {
			if(ishanNum(i)) {
				count++;
			} else {
				continue;
			}
		}
		
		System.out.println(count);

	}

	// 입력받은 수가 한수인지 판단
	public static boolean ishanNum(int x) {
		
		int a = x/1000;
		int b = (x/100)%10;
		int c = (x/10)%10;
		int d = x%10;
		
		// 100보다 작은 수는 모두 한수
		if(x < 100) {
			return true;
		// 입력받은 수가 세자리 수인 경우
		} else if(x >= 100 && x < 1000) {
			if(b-c == c-d) {
				return true;
			} else {
				return false;
			}
		} else {
			if(a-b == b-c && b-c == c-d) {
				return true;
			} else {
				return false;
			}
		}
		
	}
}