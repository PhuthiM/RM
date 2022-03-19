
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Bidding {

    Scanner sc = new Scanner(System.in);
    Map<Integer, Product> tree = new LinkedHashMap<>();

    public static void main(String[] args) {

        Bidding bd = new Bidding();
        while (true) {
            String cmd = bd.sc.next();
            switch (cmd) {
                case "exit":
                    System.exit(0);
                    break;
                case "new":
                    bd.add();
                    break;
                case "delete":
                    bd.delete();
                    break;
                case "view":
                    bd.view();
                    break;
                case "viewall":
                    bd.viewall();
                    break;
                case "bid":
                    bd.bid();
                    break;
            }
        }
    }

    void add() {
        int id = sc.nextInt();
        String namepro = sc.next();
        String owner = sc.next();
        int price = sc.nextInt();
        Product pd = new Product(id, namepro, owner, price);
        tree.put(id, pd);
    }

    void delete() {
        int id = sc.nextInt();
        tree.remove(id);
    }

    void bid() {
        int id = sc.nextInt();
        String bidder1 = sc.next();
        int price1 = sc.nextInt();
        Product pd = tree.get(id);
        if (pd.price < price1) {
            pd.price = price1;
            pd.bidder = bidder1;
        }
    }

    void view() {
        int id = sc.nextInt();
        Product pd = tree.get(id);
        System.out.println("view " + pd.id + " " + pd.namepro + " " + pd.price + " " + pd.bidder);
    }

    void viewall() {
        System.out.println("viewall " + tree.size() + " items");
        for (Map.Entry e : tree.entrySet()) {
            Product pd = (Product) e.getValue();
//            System.out.println(e.getKey() + " " + pd.namepro + " " + pd.price + " " + pd.bidder);
        }
        System.out.println("==========");
    }
}

class Product {

    int id;
    String namepro;
    String owner;
    int price;
    String bidder;

    public Product(int id, String namepro, String owner, int price) {
        this.id = id;
        this.namepro = namepro;
        this.owner = owner;
        this.price = price;
        bidder = null;
    }

}
