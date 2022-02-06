package by.tms.model;

import java.util.ArrayList;

import static by.tms.utils.Constans.*;

public class MilitaryOffice {
    private PersonRegistry personRegistry;

    public MilitaryOffice(PersonRegistry personRegistry) {
        this.personRegistry = personRegistry;
    }

    // считает призывников с именем
    public int countRecruitByName(String name) {
        int countRecruit = 0;
        if (name != null) {

          /*  for (int i = 0; i < personRegistry.citizens.length; i++) {
                Person person = personRegistry.citizens[i]; // один человек из регистратуры
                if (person.getName().toLowerCase().trim().equals(name.toLowerCase().trim()) && person.getAge() >= MIN_AGE && person.getAge() <= MAX_AGE && person.getGender().toLowerCase().equals(MALE)) {
                    countRecruit++;
                }
            }*/
            for (int i = 0; i < personRegistry.personRegistryList.size(); i++) {
                Person person = personRegistry.personRegistryList.get(i);
                if (person.getName().toLowerCase().trim().equals(name.toLowerCase().trim()) && person.getAge() >= MIN_AGE && person.getAge() <= MAX_AGE && person.getGender().toLowerCase().equals(MALE)) {
                    countRecruit++;
                }
            }
        }
        return countRecruit;
    }

    // создает список из призывников
    public ArrayList<Person> findByRecruit() {
        ArrayList<Person> objects = new ArrayList<>();

        for (int i = 0; i < personRegistry.personRegistryList.size(); i++) {
            // Person person = personRegistry.citizens[i]; // один человек из регистратуры
            Person person = personRegistry.personRegistryList.get(i);
            if (person.getAge() >= MIN_AGE && person.getAge() <= MAX_AGE && person.getGender().toLowerCase().equals(MALE)) {
                objects.add(person);
            }
        }
        return objects;
    }

    // считает призывников в городе
    public int countRecruitByCity(String city) {
        int countRecruit = 0;
        if (city != null) {

            for (int i = 0; i < personRegistry.personRegistryList.size(); i++) {
                //Person person = personRegistry.citizens[i]; // один человек из регистратуры
                Person person = personRegistry.personRegistryList.get(i);
                if (person.getAddress().getCity().toLowerCase().trim().equals(city.toLowerCase().trim()) && person.getAge() >= MIN_AGE && person.getAge() <= MAX_AGE && person.getGender().toLowerCase().equals(MALE)) {
                    countRecruit++;
                }
            }
        }
        return countRecruit;
    }

    // считает призывников в интервале по возрасту
    public int countRecruitByAge(int ageMin, int ageMax) {
        int countRecruit = 0;
        if (ageMin != 0 && ageMax != 0) {

            for (int i = 0; i < personRegistry.personRegistryList.size(); i++) {
                // Person person = personRegistry.citizens[i]; // один человек из регистратуры
                Person person = personRegistry.personRegistryList.get(i);
                if (person.getAge() >= ageMin && person.getAge() <= ageMax && person.getAge() >= MIN_AGE && person.getAge() <= MAX_AGE && person.getGender().toLowerCase().equals(MALE)) {
                    countRecruit++;
                }
            }
        }
        return countRecruit;
    }
}
