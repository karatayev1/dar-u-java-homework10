import java.util.*;

public class PhoneBook {
    private HashMap<String, List<String>> phoneBook;

    public PhoneBook() {
        phoneBook = new HashMap<>();
    }

    public void add(String lastName, String phoneNumber) {
        List<String> numbers = phoneBook.getOrDefault(lastName, new ArrayList<>());
        numbers.add(phoneNumber);
        phoneBook.put(lastName, numbers);
    }

    public List<String> get(String lastName) {
        return phoneBook.getOrDefault(lastName, Collections.emptyList());
    }

    public void remove(String lastName) {
        phoneBook.remove(lastName);
    }

    public void list() {
        for (Map.Entry<String, List<String>> entry : phoneBook.entrySet()) {
            String lastName = entry.getKey();
            List<String> numbers = entry.getValue();
            System.out.println(lastName + ": " + numbers);
        }
    }
}
