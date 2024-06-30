import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);

        int h = sc.nextInt();
        int w = sc.nextInt();
        int n = sc.nextInt();
        int m = sc.nextInt();

        int count = 0;

        for(int r = 0; r < h; r += n + 1) {
            for(int c = 0; c < w; c += m + 1) {
                ++count;
            }
        }

        System.out.println(count);
    }
}