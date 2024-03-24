class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        boolean len = true;
        boolean isNumber = true;
        if(s.length()==4 || s.length() == 6){
            len = true;
        }else{
            len = false;
        }
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)>= 48 && s.charAt(i) <= 57){
                isNumber = true;
            }else{
                isNumber = false;
                break;
            }
        }
        if(len == true && isNumber == true){
            answer = true;
        }else{
            answer = false;
        }
        return answer;
    }
}