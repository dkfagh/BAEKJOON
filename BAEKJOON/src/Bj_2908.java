import java.util.Scanner;

public class Bj_2908 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 두 수를 문자열로 취급하여 저장
		String a = sc.next();
		String b = sc.next();
		
		// 문자열로 저장한 두 수를 한글자씩 나눠서 저장
		String[] tempA = a.split("");
		String[] tempB = b.split("");
		
		// 한글자씩 나눠서 배열에 저장된 값을을 역순으로 붙여서 int형으로 변환
		int aa = Integer.parseInt(tempA[2] + tempA[1] + tempA[0]);
		int bb = Integer.parseInt(tempB[2] + tempB[1] + tempB[0]);
		
		// 3항연산자로 비교하여 큰 값을 출력
		System.out.println( (aa > bb) ? aa : bb );
		
		sc.close();

	}
}