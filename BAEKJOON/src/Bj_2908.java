import java.util.Scanner;

public class Bj_2908 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// �� ���� ���ڿ��� ����Ͽ� ����
		String a = sc.next();
		String b = sc.next();
		
		// ���ڿ��� ������ �� ���� �ѱ��ھ� ������ ����
		String[] tempA = a.split("");
		String[] tempB = b.split("");
		
		// �ѱ��ھ� ������ �迭�� ����� ������ �������� �ٿ��� int������ ��ȯ
		int aa = Integer.parseInt(tempA[2] + tempA[1] + tempA[0]);
		int bb = Integer.parseInt(tempB[2] + tempB[1] + tempB[0]);
		
		// 3�׿����ڷ� ���Ͽ� ū ���� ���
		System.out.println( (aa > bb) ? aa : bb );
		
		sc.close();

	}
}