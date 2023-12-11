package week_14.assigment.question_14_18;

import java.util.HashMap;
import java.util.Map;

public class Question_14_18 {
    public static void main(String[] args) {

      ContactManager contact = new ContactManager(new HashMap<>());
        contact.addContact("Taha Cetinkaya" , "123-456-7890");
        contact.addContact("Ozgur Kartal" , "456-321-1213");

        System.out.println(contact.searchByName("Taha Cetinkaya"));
        System.out.println(contact.searchByPhoneNumber("456-321-1213"));


    }
}
