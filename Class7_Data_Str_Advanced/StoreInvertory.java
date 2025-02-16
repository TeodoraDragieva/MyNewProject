import java.util.HashMap;
import java.util.Map;

public class StoreInvertory {

    public static void main(String[] args) {
        Map<String, Integer> inventory = new HashMap<>();
        inventory.put("Apples", 50);
        inventory.put("Bananas", 30);
        inventory.put("Oranges", 20);
        inventory.put("Milk", 10);

        String productToCheck = "Bananas";
        if (inventory.containsKey(productToCheck)) {
            System.out.println(productToCheck + " in stock: " + inventory.get(productToCheck));
        } else {
            System.out.println(productToCheck + " is not in the inventory.");
        }
        
        String productToRestock = "Milk";
        int additionalStock = 15;
        inventory.put(productToRestock, inventory.get(productToRestock) + additionalStock);
        System.out.println("Restocked " + productToRestock + ". New quantity: " + inventory.get(productToRestock));

        String outOfStockProduct = "Oranges";
        inventory.put(outOfStockProduct, 0);
        System.out.println(outOfStockProduct + " marked as out of stock.");

        String productToRemove = "Apples";
        inventory.remove(productToRemove);
        System.out.println(productToRemove + " has been removed from the inventory.");

        System.out.println("\nCurrent Inventory:");
        for (Map.Entry<String, Integer> entry : inventory.entrySet()) {
            System.out.println("Product: " + entry.getKey() + ", Quantity: " + entry.getValue());
        }
    }
}
