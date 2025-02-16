import java.util.HashSet;
import java.util.Set;

public class PartyGuestList {

    public static void main(String[] args) {
        Set<String> guestList = new HashSet<>();
        guestList.add("Alice");
        guestList.add("Bob");
        guestList.add("Charlie");
        guestList.add("Diana");
        
        boolean added = guestList.add("Alice");
        System.out.println("Attempt to add 'Alice' again: " + (added ? "Added" : "Already in the list"));

        guestList.remove("Charlie");
        System.out.println("Removed 'Charlie' from the guest list.");

        String personToCheck = "Bob";
        if (guestList.contains(personToCheck)) {
            System.out.println(personToCheck + " is on the guest list.");
        } else {
            System.out.println(personToCheck + " is not on the guest list.");
        }

        System.out.println("Final guest list:");
        for (String guest : guestList) {
            System.out.println(guest);
        }
    }
}
