package Beginner.Day7;

public class TotalPrice {
    public int solution(int n, int k) {
        int answer = 12000 * n + 2000 * (k - (n/10));
        return answer;
    }
}