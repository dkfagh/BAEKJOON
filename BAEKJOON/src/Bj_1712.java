import java.util.Scanner;

public class Bj_1712 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// �������
		int a = sc.nextInt();
		// �������
		int b = sc.nextInt();
		// ��ǰ����
		int c = sc.nextInt();
		
		// ��������� ��ǰ���ݺ��� ũ�ų� ���� ��� ���ͺб����� ������ �� ����
		if(b >= c) {
			System.out.println(-1);
		} else {
			System.out.println(a / (c-b) + 1);
		}

		sc.close();
	}

}