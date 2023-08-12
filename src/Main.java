import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Contact contactBook=new Contact();

        contactBook.addContact(8900000,"Mas");
        contactBook.addContact(95746321,"Boris");
        contactBook.addContact(392871,"Gas");


//        Scanner scanner=new Scanner(System.in);
//        while (true){
//            System.out.println("Your command:");
//            String sc=scanner.nextLine();
//
//            if (scanner.equals("CONTACTS")) {
//                contactBook.getAllContacts();
//            }
//            if(sc.matches("[0-9]")) {
//                contactBook.searchByPhone(Integer.valueOf(sc));
//            } else {
//                contactBook.searchByName(sc);
//            }
//        }
    }
}
