import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if(num == 1) System.out.println(1);
        else if(num <= 7) System.out.println(2);
        else System.out.println(calc(num, 1, 0));
    }
    public static int calc(int num, int data, int level) {
        if(num <= data) return 0;

        if(num <= 1) return 1;
        else if(num <= 2) return calc(num -= 1, 6, ++level) + 1;
        else return calc(num -= data, 6 * level, ++level) + 1;
    }
}