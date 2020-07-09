import java.util.Scanner;

public class Bj_1152 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 입력받은 첫 줄에서 앞뒤 공백을 제거(trim)하고 저장
		String x = sc.nextLine().trim();
		
		// x의 값을 공백으로 구분하여 배열에 저장
		String[] temp = x.split(" ");
		
		if(x.isEmpty()) {
			System.out.println("0");
		} else {
			System.out.println(temp.length);
		}
		
		sc.close();

	}
}