import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int start = 1;
        int level = 1;

        System.out.println(calc(num, 2, start, level));
    }
    public static int calc(int num, int data, int start, int level) {
        if(num <= 0 || num == 1) return 1;
        else if(num <= 7) return 2;
        else if((num - (6 * level)) < 0) return calc(1, data+=6, start, ++level) + 1;
        else return calc(num -= (6 * level), data+=(6 * level), start, ++level) + 1;
    }
}