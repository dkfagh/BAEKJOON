import java.util.Scanner;

public class Bj_2775 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		// �׽�Ʈ���̽� ����
		int n = sc.nextInt();
		
		// �� ȣ�� �� �������� ����
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
		
		// 0�� ȣ�� �� �ο��� ȣ���� ����
		if(a == 0) {
			answer = b;
		// �� ���� 1ȣ �ο��� 1������ �����Ǿ� �ִ�
		} else if(b == 1) {
			answer = 1;
		} else {
			answer = personnel(a, b-1) + personnel(a-1, b);
		}
		
		return answer;
	}

}