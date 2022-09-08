package ch.bbw.lg.cleudoliamgleeson.models;

import ch.bbw.lg.cleudoliamgleeson.models.classes.Person;
import ch.bbw.lg.cleudoliamgleeson.models.classes.Room;
import ch.bbw.lg.cleudoliamgleeson.models.classes.Wepon;

import java.util.ArrayList;
import java.util.List;

public class DataService {
    private List<Person> people = new ArrayList<>();
    private List<Wepon> wepons = new ArrayList<>();
    private List<Room> rooms = new ArrayList<>();
    private List<String> history;

    public void addPerson(Person person){
        people.add(person);
    }

    public List<Person> getPeople() {
        return people;
    }

    public void setPeople(List<Person> people) {
        this.people = people;
    }

    public List<Wepon> getWepons() {
        return wepons;
    }

    public void setWepons(List<Wepon> wepons) {
        this.wepons = wepons;
    }

    public List<Room> getRooms() {
        return rooms;
    }

    public void setRooms(List<Room> rooms) {
        this.rooms = rooms;
    }

    public List<String> getHistory() {
        return history;
    }

    public void setHistory(List<String> history) {
        this.history = history;
    }
}
