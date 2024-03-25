import java.util.*;
class Solution {
    public int[] solution(int n, int m) {
        List<Integer> answer = new ArrayList<>();
        for(int i = Math.min(n,m);i>=1;i--){
            if(n%i==0 && m%i==0){
                answer.add(i);
                break;
            }
        }
        for(int i=Math.max(n,m);i<Integer.MAX_VALUE;i++){
            if(i % n == 0 && i % m == 0){
                answer.add(i);
                break;
            }
        }
        return answer.stream().mapToInt(x->x).toArray();
    }
}