class Solution {
    public String solution(String s) {
        String[] strarr = s.split("");
        StringBuilder sb = new StringBuilder();
        if(s.length()%2 == 1){
            sb.append(strarr[strarr.length /2]);
        }else{
            for(int i=strarr.length/2-1;i<=strarr.length/2;i++){
                sb.append(strarr[i]);
            }
        }
        return sb.toString();
    }
}