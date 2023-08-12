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

    public String searchByName(String name) {
        String phone = contactBook.get(name);
        if (contactBook.containsValue(name)) {
            System.out.println(contactBook.get(phone) + " - " + phone);
        } else {
            System.out.println("Contact not found :((");
        }
        return phone;
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
