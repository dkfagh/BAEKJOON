import java.util.Scanner;

public class Bj_1065 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		
		int count = 0;
		
		// 1���� ũ�ų� ���� �Է¹��� ��(x)���� �۰ų� ���� �� �� �Ѽ��� ���� ���� ����
		for(int i = 1 ; i <= x ; i++) {
			if(ishanNum(i)) {
				count++;
			} else {
				continue;
			}
		}
		
		System.out.println(count);

	}

	// �Է¹��� ���� �Ѽ����� �Ǵ�
	public static boolean ishanNum(int x) {
		
		int a = x/1000;
		int b = (x/100)%10;
		int c = (x/10)%10;
		int d = x%10;
		
		// 100���� ���� ���� ��� �Ѽ�
		if(x < 100) {
			return true;
		// �Է¹��� ���� ���ڸ� ���� ���
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