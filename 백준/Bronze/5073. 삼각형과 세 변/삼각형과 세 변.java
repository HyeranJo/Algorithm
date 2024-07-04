import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean flag = true;
        while(flag) {
            String line = sc.nextLine();

            int a = Integer.parseInt(line.split(" ")[0]);
            int b = Integer.parseInt(line.split(" ")[1]);
            int c = Integer.parseInt(line.split(" ")[2]);

            if(a == 0 && b == 0 && c == 0) {
                flag = false;
                break;
            }

            int[] array = {a, b, c};
            int max = 0;
            for(int i = 0; i < array.length; ++i) {
                if(array[max] < array[i]) {
                    max = i;
                }
            }

            for(int i = 0; i < array.length; ++i) {
                if(i == max) {
                    int sum = 0;
                    for(int j = 0; j < array.length; ++j) {
                        if(j != max) sum += array[j];
                    }
                    if(array[i] >= sum) {
                        System.out.println("Invalid");
                    } else {
                        int count = 0;
                        if(a == b) count += 1;
                        if(b == c) count += 1;
                        if(c == a) count += 1;

                        if(count == 3) System.out.println("Equilateral");
                        else if(count >= 1) System.out.println("Isosceles");
                        else System.out.println("Scalene");
                    }
                }
            }
        }
    }
}