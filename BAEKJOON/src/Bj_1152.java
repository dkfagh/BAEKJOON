import java.util.Scanner;

public class Bj_1152 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// �Է¹��� ù �ٿ��� �յ� ������ ����(trim)�ϰ� ����
		String x = sc.nextLine().trim();
		
		// x�� ���� �������� �����Ͽ� �迭�� ����
		String[] temp = x.split(" ");
		
		if(x.isEmpty()) {
			System.out.println("0");
		} else {
			System.out.println(temp.length);
		}
		
		sc.close();

	}
}