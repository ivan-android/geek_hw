package com.company.lesson_10;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class PhoneBook {

    private Map<Integer, String> contactsMap = new HashMap<>();

    public void addContact (int phone, String name) {
        contactsMap.put(phone, name);
    }

    public ArrayList<Integer> getPhone (String name) {
        ArrayList<Integer> listResultPhone = new ArrayList<>();
        for (Map.Entry<Integer, String> elem : contactsMap.entrySet()) {
            if (elem.getValue().equals(name)) {
                listResultPhone.add(elem.getKey());
            }

        }
        return listResultPhone;
    }
}
