import java.util.Scanner;

public class Bj_1712 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// 고정비용
		int a = sc.nextInt();
		// 가변비용
		int b = sc.nextInt();
		// 제품가격
		int c = sc.nextInt();
		
		// 가변비용이 제품가격보다 크거나 같을 경우 손익분기점이 존재할 수 없다
		if(b >= c) {
			System.out.println(-1);
		} else {
			System.out.println(a / (c-b) + 1);
		}

		sc.close();
	}

}