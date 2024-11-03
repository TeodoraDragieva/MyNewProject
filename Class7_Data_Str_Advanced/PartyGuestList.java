import java.util.HashSet;
import java.util.Set;

public class PartyGuestList {

    public static void main(String[] args) {
        // Създаваме HashSet за уникални гости
        Set<String> guestList = new HashSet<>();

        // Добавяне на няколко гости в списъка
        guestList.add("Alice");
        guestList.add("Bob");
        guestList.add("Charlie");
        guestList.add("Diana");

        // Опит за добавяне на дублиращо се име
        boolean added = guestList.add("Alice");
        System.out.println("Attempt to add 'Alice' again: " + (added ? "Added" : "Already in the list"));

        // Премахване на гост, който не може да присъства
        guestList.remove("Charlie");
        System.out.println("Removed 'Charlie' from the guest list.");

        // Проверка дали конкретен човек е в списъка с гости
        String personToCheck = "Bob";
        if (guestList.contains(personToCheck)) {
            System.out.println(personToCheck + " is on the guest list.");
        } else {
            System.out.println(personToCheck + " is not on the guest list.");
        }

        // Печат на всички гости, които ще присъстват
        System.out.println("Final guest list:");
        for (String guest : guestList) {
            System.out.println(guest);
        }
    }
}
