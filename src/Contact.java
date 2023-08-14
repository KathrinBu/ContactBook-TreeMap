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
        for (Map.Entry<Integer,String> entry: contactBook.entrySet()) {
            if(entry.getValue().equals(name))
                return entry.getKey();
        }
        return -1;
    }
    public String searchByPhone(Integer phone){
      /*  for (Map.Entry<Integer,String> entry: contactBook.entrySet()){
            if (entry.getValue() == String.valueOf(phone)){
                System.out.println(entry.getKey()+" - "+phone);
            }
        }  System.out.println("Contact not found :((");*/
        if(contactBook.containsKey(phone))
            return contactBook.get(phone);
        else
            return "абонент неизвестен";
    }
    public void getAllContacts() {
        for (Map.Entry<Integer, String> entry : contactBook.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }

    }
}
