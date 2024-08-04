import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        Map<Character, Integer> list = new HashMap<>();
        for(int i = 0; i < str.length(); ++i) {
            char upperCase = Character.toUpperCase(str.charAt(i));
            if(Optional.ofNullable(list.get(upperCase)).isPresent()) {
                int count = list.get(upperCase);
                list.put(upperCase, ++count);
            } else {
                list.put(upperCase, 1);
            }
        }

        int max = 0;
        Set<Map.Entry<Character, Integer>> entries = list.entrySet();
        for(Map.Entry<Character, Integer> data :entries) {
            if(data.getValue() > max) max = data.getValue();
        }

        int cnt = 0;
        Character key = ' ';
        for(Map.Entry<Character, Integer> data :entries) {
            if(max == data.getValue()) {
                ++cnt;
                key = data.getKey();
            }
        }
        if(cnt > 1) {
            System.out.println("?");
        } else {
            System.out.println(key);
        }
    }
}