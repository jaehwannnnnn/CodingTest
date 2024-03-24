class Solution {
    public long solution(int price, int money, int count) {
        long answer = 0;
        for(int i=1;i<=count;i++){
            answer = answer + i * price;
        }
        answer = answer - money;
        if(answer > 0){
            return answer;
        }else{
            return 0;
        }
    }
}