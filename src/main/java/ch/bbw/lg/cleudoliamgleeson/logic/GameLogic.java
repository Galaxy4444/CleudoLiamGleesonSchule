package ch.bbw.lg.cleudoliamgleeson.logic;

import ch.bbw.lg.cleudoliamgleeson.models.DataService;
import ch.bbw.lg.cleudoliamgleeson.models.classes.Crime;
import java.lang.Math;
public class GameLogic {

    public void setupNewGame(DataService service, Crime secret){
        int peopleLength = service.getPeople().size();
        int roomLength = service.getRooms().size();
        int weaponLength = service.getWepons().size();

        int peopleRand = (int) Math.round(Math.random() * 10);
        int roomRand = (int) Math.round(Math.random() * 10);
        int weaponRand = (int) Math.round(Math.random() * 10);

        if (peopleRand>= peopleLength){
            secret.setActor(peopleLength - 1);
        } else {
            secret.setActor(peopleRand);
        }

        if ( roomRand >= roomLength){
            secret.setScene(roomLength - 1);
        } else {
            secret.setScene(roomRand);
        }
        if (weaponRand >= weaponLength){
            secret.setActor(weaponLength - 1);
        } else {
            secret.setWeapon(weaponRand);
        }
    }

    public boolean evaluateSuggestion(Crime suggestion, Crime secret, int numberOfSuggestion, int maxNumberOfSuggestions){
        if (suggestion.getActor() == secret.getActor() && suggestion.getScene() == secret.getScene() && suggestion.getWeapon() == secret.getWeapon() && numberOfSuggestion <= maxNumberOfSuggestions){
            secret.getHistory().add("won");
            return true;
        } else {
            if (numberOfSuggestion > maxNumberOfSuggestions){
                secret.getHistory().add("lost");
                return false;
            }
            int counter = 0;
            if (suggestion.getActor() == secret.getActor()){
                counter++;
            }
            if(suggestion.getScene() == secret.getScene()){
                counter++;
            }
            if(suggestion.getWeapon() == secret.getWeapon()){
                counter++;
            }
            secret.getHistory().add(counter +"");
            return false;
        }
    }
}
