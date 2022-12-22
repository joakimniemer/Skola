import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;

public class Exercise1 {
    public static void main(String[] args) {

        var itemList = new ArrayList<InventoryItem>();
        itemList.add(new InventoryItem("Hammare", 32, 25.50));
        itemList.add(new InventoryItem("Spik", 255, 1.25));
        itemList.add(new InventoryItem("Skruv", 325, 1.5));
        itemList.add(new InventoryItem("Skruvdragare", 25, 455));
        itemList.add(new InventoryItem("Spade", 65, 125));

        itemList.stream().forEach(System.out::println);

        System.out.println("------");

        Collections.sort(itemList);
        itemList.stream().forEach(System.out::println);

        System.out.println("------");

        var comp = Comparator.comparing(InventoryItem::getPrice);
        Collections.sort(itemList, comp);
        itemList.stream().forEach(System.out::println);

        System.out.println("------");

        System.out.printf("Ändrar pris på %s.", itemList.get(0).getName());
        itemList.get(0).setPrice(itemList.get(0).getPrice()*1.5);
        System.out.printf(" Det nya priset på en %s blir %.2f%n", itemList.get(0).getName(), itemList.get(0).getPrice());

        itemList.stream().forEach(System.out::println);


    }
}
