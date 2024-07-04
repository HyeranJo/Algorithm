import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true) {
            List<Integer> data = new ArrayList<>();
            data.add(sc.nextInt());
            data.add(sc.nextInt());
            data.add(sc.nextInt());

            int sum = data.stream().reduce((x,y)->x+y).get();
            
            int max = Collections.max(data);
            if(max == 0) break;

            Set<Integer> dataSet = new HashSet<>(data);
            int count = dataSet.size();

            if(sum - max <= max) System.out.println("Invalid");
            else if(count == 1) System.out.println("Equilateral");
            else if(count == 2) System.out.println("Isosceles");
            else System.out.println("Scalene");
        }
    }
}
