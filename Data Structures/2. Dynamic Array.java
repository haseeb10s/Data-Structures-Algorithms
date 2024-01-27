//Dynamic Array
import java.util.*;
class Array {
    private int[] items;
    private int count;
    public Array(int length) {
        items = new int[length];
    }
    public void insert(int item) {
        try {
            if (items.length == count) {
                int[] newItems = new int[count * 2];
                for (int i = 0; i < count; i++) {
                    newItems[i] = items[i];
                }
                items = newItems;
            }
            items[count++] = item;
        } catch (Exception e) {
            System.err.println("An error occurred while inserting the item: " + e.getMessage());
        }
    }
    public void print() {
        for (int i = 0; i < count; i++) {
            System.out.println(items[i]);
        }
    }
}
public class Main {
    public static void main(String[] args) {
        Array numbers = new Array(3);
        numbers.insert(10);
        numbers.insert(30);
        numbers.insert(40);
        numbers.insert(50);
        numbers.print();
    }
}