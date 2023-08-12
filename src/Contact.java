import java.util.Map;
import java.util.TreeMap;

public class Contact {
    Map<Integer, String> contactBook = new TreeMap<>();

    public void addContact(Integer phone, String name) {
        if (contactBook.containsKey(phone)) {
            contactBook.replace(phone, contactBook.get(phone), name);
        } else {
            contactBook.put(phone, name);
        }
    }

    public int searchByName(String name) {
        int result = Integer.parseInt(contactBook.get(name));
        if (name != null) {
            System.out.println(contactBook.get(result) + " - " + result);
        } else {
            System.out.println("Contact not found :((");
        } return result;
    }
    public void searchByPhone(Integer phone){
        for (Map.Entry<Integer,String> entry: contactBook.entrySet()){
            if (entry.getValue() == String.valueOf(phone)){
                System.out.println(entry.getKey()+" - "+phone);
            }
        }  System.out.println("Contact not found :((");

    }
    public void getAllContacts() {
        for (Map.Entry<Integer, String> entry : contactBook.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }

    }
}
