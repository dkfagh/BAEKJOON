public class Bj_4673 {

	public static void main(String[] args) {
		
		boolean[] temp = new boolean[10001];
		
		// �����ѹ��� ���� true
		
		for(int i = 1 ; i <= temp.length ; i++) {
			// selfnum(i) ���� 10000���� Ŭ ��� �ѱ�
			if(selfnum(i) > temp.length-1) {
				continue;
			// selfnum(i) ���� true�� ����
			} else {
				temp[selfnum(i)] = true;
			}
		}
		
		for(int i = 1 ; i < temp.length ; i++) {
			// �����ѹ��� �ƴ� ��(temp�迭�� ���� false�� ��)�� ���
			if(!temp[i]) {
				System.out.println(i);
			}
		}
	}
	
	// �����ѹ� ���� �Լ�
	public static int selfnum(int a) {
		
		int x = a + a/1000 + (a/100)%10 + (a/10)%10 + a%10;
		
		return x;
	}
	
}