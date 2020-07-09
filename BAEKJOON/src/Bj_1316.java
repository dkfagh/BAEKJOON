import java.util.ArrayList;
import java.util.Scanner;

public class Bj_1316 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		// �׷�ܾ��� ����
		int count = 0;
		
		for(int i = 0 ; i < n ; i++) {
			if(isGroupChar(sc.next())) {
				count++;
			}
		}
		
		System.out.println(count);		
		
		sc.close();

	}
	
	public static boolean isGroupChar(String x) {
				
		boolean flag = true;
		
		// �Է¹��� �ܾ �� ���ھ� ������ AraryList ����
		ArrayList<Character> temparr = new ArrayList<>();
				
		// �־��� ���ڿ��� ù��° ����
		char c = x.charAt(0);
		// ù��° ���ڸ� temparr�� ����
		temparr.add(c);
		
		for(int i = 1 ; i < x.length() ; i++) {
			// ���� ���ڰ� ���� ���ڿ� ���� ���
			if(c == x.charAt(i)) {
				continue;
			// ���� ���ڰ� ���� ���ڿ� �ٸ� ���
			} else {
				// ���� ���ڰ� �̹� temparr�� ������ ��� -> �׷�ܾ �ƴ�
				if(temparr.contains(x.charAt(i))) {
					flag = false;
				} else {
					temparr.add(x.charAt(i));
					c = x.charAt(i);
				}
			}
		}
		
		return flag;
	}

}