package by.tms.model;

/**
 * класс для работы с адресом
 */
public class Address {
    private String country;
    private String city;
    private String house;
    private String room;

    public Address(String country, String city, String house, String room) {
        this.country = country;
        this.city = city;
        this.house = house;
        this.room = room;
    }

    public Address() {
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setHouse(String house) {
        this.house = house;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    public String getCountry() {
        return country;
    }

    public String getCity() {
        return city;
    }

    public String getHouse() {
        return house;
    }

    public String getRoom() {
        return room;
    }

    @Override
    public String toString() {
        return '\n' +
                " country=" + country + '\n' +
                " city= " + city + '\n' +
                " house= " + house + '\n' +
                " room= " + room + '\n';

    }
}
