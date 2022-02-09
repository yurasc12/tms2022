package by.tms.model;

import java.util.List;

public class PersonRegistry {
    //Person[] citizens; //массив c объектами граждан
    private List<Person> personRegistryList;//= new ArrayList<>();
    //public PersonRegistry(Person[] citizens) {
    //    this.citizens = citizens;
    //  }


    public PersonRegistry(List<Person> personRegistryList) {
        this.personRegistryList = personRegistryList;
    }

    public List<Person> getPersonRegistryList() {
        return personRegistryList;
    }
/* @Override
    public String toString() {
        return "PersonRegistry{" +
                "citizens=" + Arrays.toString(citizens) +
                '}';

    }*/

    @Override
    public String toString() {
        return "PersonRegistry {" +
                "personRegistryList=" + personRegistryList +
                '}';
    }
}
