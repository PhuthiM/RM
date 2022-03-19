
import java.util.Scanner;
import java.util.*;

public class FixingI {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TreeMap<Integer, Integer> tree = new TreeMap<>();
        
        while (true) {
            int number = sc.nextInt();
            if (number <= 0) {
                break;
            }
            if (tree.get(number) == null) {
                tree.put(number, 1);
                System.out.println("Get " + number + " 1 time");
            } else {
                tree.put(number, tree.get(number) + 1);
                System.out.println("Get " + number + " " + tree.get(number) + " times");
            }
        }
        
        for (Map.Entry entry : tree.entrySet()) {
            System.out.print(entry.getValue()+ " ");
        }

    }
}
