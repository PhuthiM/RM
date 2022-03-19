
import java.util.Scanner;
import java.util.*;

public class SumOfTheMiddle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TreeMap<Integer, Integer> treemap = new TreeMap<>();

        while (true) {
            int num = sc.nextInt();
            if (num < 0) {
                break;
            }
            if (treemap.get(num) == null) {
                treemap.put(num, 1);
            } else {
                treemap.put(num, treemap.get(num) + 1);

            }
        }
        int n = sc.nextInt();
        int m = sc.nextInt();

        if (n > m) {
            int t = n;
            n = m;
            m = t;

        }
        int count = 0;
        int count2 = 0;
        int count3 = 0;
        int count4 = 0;
        for (Map.Entry e : treemap.entrySet()) {
            if ((int) e.getKey() >= n && (int) e.getKey() <= m) {
                count++;
                count2 += (int) e.getValue();
                count3 += (int) e.getKey();
                count4 += ((int) e.getKey() * (int) e.getValue());
            }
        }
        System.out.println(count);
        System.out.println(count2);
        System.out.println(count3);
        System.out.println(count4);
    }
}
