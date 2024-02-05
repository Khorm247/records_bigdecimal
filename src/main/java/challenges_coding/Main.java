package challenges_coding;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Owner tierBesitzer = new Owner("Steve M", "bald 40", "sachichnich weil Datenschutz undso!");
        Animal pet1 = new Animal(tierBesitzer,"123-467-D33", "Hund", "Toby", "Spitz-Mischling", "11 Monate");
        Animal pet2 = new Animal(tierBesitzer,"456-467-D33", "Katze", "Mr.Miaugi", "Britisch Kurzhaar", "3 Jahre, 3 Monate ");
        Animal pet3 = new Animal(tierBesitzer,"789-467-D33", "Henne", "Brightey", "F1 Hybrid", "4 Monate");

        List<Animal> tierListe = new ArrayList<>();

        System.out.println(pet1);
        System.out.println(pet2);
        System.out.println(pet3);

        tierListe.add(pet1);
        tierListe.add(pet2);
        tierListe.add(pet3);

        for (Animal pet : tierListe){
            if(pet.typ().equals("Hund"))
                System.out.println(pet);
        }
    }
}
