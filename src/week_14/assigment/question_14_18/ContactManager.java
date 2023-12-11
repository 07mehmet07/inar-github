package week_14.assigment.question_14_18;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class ContactManager {

    private Map<String, String> map;


    public ContactManager(Map<String, String> map) {
        this.map = new HashMap<>();
    }

    public void addContact(String name, String phoneNumber) {
        if (!map.containsKey(name)) {
            map.put(name, phoneNumber);
        } else {
            System.out.println("there is same name! try another name again ! ");
        }
    }

    public String searchByName(String name) {
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (name.equals(entry.getKey())) {
                return name + "'s Phone Number: " + entry.getValue();
            }
        }
        return "there isn't that name and phone number";
    }

    public String searchByPhoneNumber(String phoneNumber) {
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (phoneNumber.equals(entry.getValue())) {
                return entry.getKey() + "'s name: " + entry.getKey();

            }
        }
        return "there isn't the name";
    }

}
