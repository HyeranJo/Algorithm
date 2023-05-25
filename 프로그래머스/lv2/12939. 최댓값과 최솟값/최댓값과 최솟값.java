class Solution {
    public String solution(String s) {
        String answer = "";
        String[] arr = s.split(" ");
        int max = Integer.parseInt(arr[0]);
        int min = Integer.parseInt(arr[0]);
        for(String data : arr) {
            int num = Integer.parseInt(data);
            max = Math.max(max, num);
            min = Math.min(min, num);
        }
        answer = String.format("%d %d", min, max);
        return answer;
    }
}