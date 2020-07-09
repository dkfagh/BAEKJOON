import java.util.ArrayList;
import java.util.Scanner;

public class Bj_1157 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		// �Է¹��� ���ڿ� str�� �빮�ڷ� �ٲ㼭 ����
		String str = s.next().toUpperCase();
		
		// �ƽ�Ű�ڵ尪�� ������ int�� �迭 ���� (A=65)
		int[] count = new int[26];
		// �ִ밪 ����
		int max = count[0];
		
		// str�� ���̸�ŭ �ݺ��ϸ� �ش� �ε����� ���ڿ� �ش��ϴ� count�迭���� ����
		for(int i = 0 ; i < str.length() ; i++) {
			count[str.charAt(i)-65]++;
		}
		
		// count�迭�� �ִ밪�� ã�� max�� ����
		for(int i = 0 ; i < count.length ; i++) {
			if(count[i] > max) {
				max = count[i];
			}
		}
		
		// count�迭�� �ִ밪�� ���� �׸��� ������ temp ����Ʈ ����
		ArrayList<String> temp = new ArrayList<>();
		
		// count�迭�� �ִ밪�� ���� �׸��� temp����Ʈ�� ����
		for(int i = 0 ; i < count.length ; i++) {
			// count���� �ִ밪�� ������ �ش� ���ĺ��� ����Ʈ�� ����
			if(count[i] == max) {
				temp.add(Character.toString((char) ((char)i+65)));
			}
		}
		
		for(String i : temp) {
			// ���� ���� ���� ���ĺ��� �� ���� ���
			if(temp.size() == 1) {
				System.out.println(i);
			} else {
				System.out.println("?");
				break;
			}
			
		}
		
		s.close();
	}

}