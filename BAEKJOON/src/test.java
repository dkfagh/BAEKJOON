
public class test {

	 public static void main(String[] args) {
	      
		 System.out.println("������ ���η� ���");
		 for(int i = 2 ; i < 10 ; i++) {
			 
			 for(int j = 1 ; j < 10 ; j++) {
				 
				 System.out.print(i + " X " + j + " = " + i*j);
				 System.out.print("\t");
			 }
			 
			 System.out.println();
		 }
		 System.out.println();
		 
		 System.out.println("������ ���η� ���");
		 for(int i = 1 ; i < 10 ; i++) {
			 
			 for(int j = 2 ; j < 10 ; j++) {
				 
				 System.out.print(j + " X " + i + " = " + i*j);
				 System.out.print("\t");
			 }
			 
			 System.out.println();
		 }
	   }
}