package Beginner.Day12;

public class CipherCode {
    public String solution(String cipher, int code) {
        String answer = "";
        for(int i=0;i<cipher.length();i++){
            if((i+1)%code == 0){
                answer += Character.toString(cipher.charAt(i));
            }
        }
        return answer;
    }
}
