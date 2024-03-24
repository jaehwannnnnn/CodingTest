import java.util.*;
class Solution {
    public String solution(String s) {
        String[] sarr = s.split("");
        Arrays.sort(sarr, Comparator.reverseOrder());
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<sarr.length;i++){
            sb.append(sarr[i]);
        }
        return sb.toString();
    }
}