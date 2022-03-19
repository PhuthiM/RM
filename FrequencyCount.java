
import java.util.Scanner;
import java.util.*;

public class FrequencyCount {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TreeMap<Integer, Integer> treemap = new TreeMap<>();

        while (true) {
            int num = sc.nextInt();
            if (num <= 0) {
                break;
            }
            if (treemap.get(num) == null) {
                treemap.put(num, 1);
            } else {
                treemap.put(num, treemap.get(num) + 1);
            }
        }
        int max = Collections.max(treemap.values());
        int min = Collections.min(treemap.values());
        System.out.print("max frequency ");
        for (Map.Entry e : treemap.entrySet()) {
            if ((int) e.getValue() == max) {
                System.out.print(e.getKey() + " ");
            }
        }
        System.out.println("");
        System.out.print("min frequency ");
        for (Map.Entry e : treemap.entrySet()) {
            if ((int) e.getValue() == min) {
                System.out.print(e.getKey() + " ");

            }
        }
        int max1 = Collections.max(treemap.keySet());
        int min1 = Collections.min(treemap.keySet());
        
        System.out.println("");
        System.out.print("No frequency ");
        for (int i = min1; i <= max1; i++) {
            if (treemap.get(i) == null) {
                System.out.print(i + " ");
            }
        }
    }
}
