import java.util.Arrays;
class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = {};
        
        int topNum = numer1 * denom2 + numer2 * denom1;
        int bottomNum = denom1 * denom2;
        
        if(denom1 > denom2) {
            int tmpNumer = numer1;
            int tmpDenom = denom1;
            numer1 = numer2;
            denom1 = denom2;
            numer2 = tmpNumer;
            denom2 = tmpDenom;
        }

        int divisor = 1;
        for(int i = 1; i <= Math.min(topNum, bottomNum); ++i) {
            if(topNum % i == 0 && bottomNum % i == 0) {
                divisor = i;
            }
        }
        
        answer = Arrays.copyOf(answer, answer.length + 2);
        answer[0] = topNum / divisor;
        answer[1] = bottomNum / divisor;
        
        return answer;
    }
}