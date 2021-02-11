package HomeworkLesson_10;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

/**
 * Java Core for Android
 * Project Homework
 *
 * @author Ivan Getman
 * @version 1.0
 * Created 11.02.2021
 */
public class Phonebook {

    private final HashMap<Integer, String> phonebook = new HashMap();

    public HashMap<Integer, String> getPhonebook() {
        return phonebook;
    }

    public ArrayList<Integer> get(String surname) {

        ArrayList<Integer> listTelephone = new ArrayList<>(phonebook.keySet());
        ArrayList<String> listSurnames = new ArrayList<>(phonebook.values());
        ArrayList<Integer> searchResult = new ArrayList<>();
        for (int i = 0; i < listSurnames.size(); i++) {
            if (surname.equals(listSurnames.get(i))) searchResult.add(listTelephone.get(i));
        }
        return searchResult;
    }

    public void add(String surname, Integer telephone) {
        if (phonebook.containsKey(telephone)) System.out.println("Вы перезаписали контакт с номером " + telephone);
        phonebook.put(telephone, surname);
    }

}