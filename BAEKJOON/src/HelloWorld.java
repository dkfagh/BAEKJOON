class Solution {
  public int solution(int n) {
      int answer = 0;
      
      for(int i=1; i<=n; i++){
          int a = n/i;
          
          answer += a;
          System.out.println(answer);
      }
      return answer;
  }
}