
import java.util.HashMap;
import java.util.Scanner;

public class Computer {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<Integer, Component> map = new HashMap<>();

        int N = sc.nextInt();
        for (int i = 1; i <= N; i++) {
            int id = sc.nextInt();
            int type = sc.nextInt();
            int price = sc.nextInt();
            int stock = sc.nextInt();
            Component compo = new Component(id, type, price, stock);
            map.put(id, compo);
        }

        int K = sc.nextInt();

        for (int i = 1; i <= K; i++) {
            int or1 = sc.nextInt();
            int or2 = sc.nextInt();
            int or3 = sc.nextInt();
            Component c = map.get(or1);
            int[] a = new int[3];
            a[c.type - 1] = 1;
            Component c1 = map.get(or2);
            a[c1.type - 1] = 1;
            Component c2 = map.get(or3);
            a[c2.type - 1] = 1;
            if (a[0] == 0 || a[1] == 0 || a[2] == 0) {
                System.out.println("invalid order");
            } else if (c.stock <= 0 || c1.stock <= 0 || c2.stock <= 0) {
                System.out.println("out of stock");
            } else {
                System.out.println(c.price + c1.price + c2.price);
                c.stock -= 1;
                c1.stock -= 1;
                c2.stock -= 1;
            }

        }
    }

}

class Component {

    int ID, type, price, stock;

    Component(int ID, int type, int price, int stock) {
        this.ID = ID;
        this.type = type;
        this.price = price;
        this.stock = stock;
    }
}
