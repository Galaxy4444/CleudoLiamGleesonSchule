package ch.bbw.lg.cleudoliamgleeson.controllers;

import ch.bbw.lg.cleudoliamgleeson.models.DataService;
import ch.bbw.lg.cleudoliamgleeson.models.classes.Person;
import ch.bbw.lg.cleudoliamgleeson.models.classes.Room;
import ch.bbw.lg.cleudoliamgleeson.models.classes.Wepon;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Collections;
import java.util.List;

@Controller
public class ViewController {
    Boolean isLoaded = false;
    DataService dataService = new DataService();

    Person chad = new Person("Chad", "giga", 24, "Musklen", "chad", false);
    Person soyBoy = new Person("Jeffery", "Mr", 44, "Glatze", "Detailhandel", false);
    Person geeler = new Person("Geeler", "Mr", 17, "Coding Sweater", "informatiker", false);
    Person lauper = new Person("Lauper", "Mr", 17, "Nicht sportlich", "Informatiker", false);
    Person stern = new Person("Stern", "Herr", 17, "Starboy", "Informatiker", false);
    Person gleeson = new Person("Gleeson", "Herr", 17, "Gitarre", "Informatiker", false);

    Wepon knife = new Wepon("Kitchen Knife", "Meele", 5, "Metal", "Sharp");
    Wepon katana = new Wepon("Katana", "Meele", 7, "Steel", "long");
    Wepon revolver = new Wepon("Relover", "Ranged", 8, "Steel", "44 Magnum");
    Wepon kar98 = new Wepon("Kar98", "DMR", 12, "Wood", "WW2 rifle");
    Wepon chainsaw = new Wepon("Chainsaw", "Meele", 20, "Metal", "Loud");
    Wepon gatlinGun = new Wepon("Mini Gun", "Ranged", 40, "Metal", "Heavy");

    Room livingRoom = new Room("Living Room", "Center", 100,"Spacious");
    Room bathRoom = new Room("Bath Room", "Center Left", 30,"No windows");
    Room kitchen = new Room("Kitchen", "Right", 50,"Full of weapons");
    Room bedRoom = new Room("Bed Room", "2nd Floor center", 60,"has revolver");
    Room garage = new Room("garage", "-1 Floor ", 90,"has chainsaw");
    Room garden = new Room("garden", "outside", 120,"lots of trees");

    public void setupPeople(List<Person> people) {
        people.add(chad);
        people.add(soyBoy);
        people.add(geeler);
        people.add(lauper);
        people.add(stern);
        people.add(gleeson);
    }
    public void setupWeapons(List<Wepon> weapons) {
        weapons.add(knife);
        weapons.add(katana);
        weapons.add(kar98);
        weapons.add(revolver);
        weapons.add(chainsaw);
        weapons.add(gatlinGun);
    }

    public void setupRooms(List<Room> rooms) {
        rooms.add(livingRoom);
        rooms.add(kitchen);
        rooms.add(bedRoom);
        rooms.add(garage);
        rooms.add(garden);
        rooms.add(bathRoom);
    }

    public void deletePeople(List<Person> people) {
        people.remove(chad);
        people.remove(soyBoy);
        people.remove(geeler);
        people.remove(lauper);
        people.remove(stern);
        people.remove(gleeson);
    }
    public void deleteWeons(List<Wepon> weapons) {
        weapons.remove(knife);
        weapons.remove(kar98);
        weapons.remove(katana);
        weapons.remove(gatlinGun);
        weapons.remove(chainsaw);
        weapons.remove(revolver);
    }

    public void deleteRooms(List<Room> rooms) {
        rooms.remove(livingRoom);
        rooms.remove(kitchen);
        rooms.remove(bedRoom);
        rooms.remove(garage);
        rooms.remove(garden);
        rooms.remove(bathRoom);
    }

    @GetMapping("/")
    public String homeForm() {

        return "index";
    }

    @GetMapping("/people")
    public String loadPeople(Model model) {
        deletePeople(dataService.getPeople());
        setupPeople(dataService.getPeople());
        model.addAttribute("people", dataService.getPeople());

        return "people";
    }

    @GetMapping("/weapons")
    public String loadWeapons(Model model) {
        deleteWeons(dataService.getWepons());
        setupWeapons(dataService.getWepons());
        model.addAttribute("weapons", dataService.getWepons());

        return "weapons";
    }

    @GetMapping("/rooms")
    public String loadRooms(Model model) {
        deleteRooms(dataService.getRooms());
        setupRooms(dataService.getRooms());
        model.addAttribute("rooms", dataService.getRooms());

        return "rooms";
    }
}
