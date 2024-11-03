import java.util.HashMap;
import java.util.Map;

public class StoreInvertory {

    public static void main(String[] args) {
        // Създаване на HashMap за управление на инвентара
        Map<String, Integer> inventory = new HashMap<>();

        // Добавяне на продукти с количеството им
        inventory.put("Apples", 50);
        inventory.put("Bananas", 30);
        inventory.put("Oranges", 20);
        inventory.put("Milk", 10);

        // Проверка на наличност за конкретен продукт
        String productToCheck = "Bananas";
        if (inventory.containsKey(productToCheck)) {
            System.out.println(productToCheck + " in stock: " + inventory.get(productToCheck));
        } else {
            System.out.println(productToCheck + " is not in the inventory.");
        }

        // Презареждане на продукт, като се увеличава неговото количество
        String productToRestock = "Milk";
        int additionalStock = 15;
        inventory.put(productToRestock, inventory.get(productToRestock) + additionalStock);
        System.out.println("Restocked " + productToRestock + ". New quantity: " + inventory.get(productToRestock));

        // Маркиране на продукт като изчерпан, като количеството се задава на нула
        String outOfStockProduct = "Oranges";
        inventory.put(outOfStockProduct, 0);
        System.out.println(outOfStockProduct + " marked as out of stock.");

        // Премахване на продукт от инвентара
        String productToRemove = "Apples";
        inventory.remove(productToRemove);
        System.out.println(productToRemove + " has been removed from the inventory.");

        // Отпечатване на целия инвентар с количествата на всеки продукт
        System.out.println("\nCurrent Inventory:");
        for (Map.Entry<String, Integer> entry : inventory.entrySet()) {
            System.out.println("Product: " + entry.getKey() + ", Quantity: " + entry.getValue());
        }
    }
}
