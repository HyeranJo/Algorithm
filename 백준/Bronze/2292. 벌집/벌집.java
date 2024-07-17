import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int data = 1;
        int level = 1;
        // System.out.println(calc(num, 1, 1));
        while(num > data) {
            data += (6 * level);
            ++level;
        }
        System.out.println(level);
    }
}