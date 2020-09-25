package nl.novi.javaprogrammeren.overerving;

//        Van een Leeuw slaan we de naam, naam van het hok, geslacht, weekdag dat die het laatst gevoed is en land van
//        herkomst op en de hoeveelheid kinderen.

public class Lion extends Animal {

    private String cage;
    private String lastFedDay;
    private String birthCountry;
    private int childCount;
    private String sound;

    public Lion(String name, String cage, String gender, String lastFedDay, String birthCountry, int childCount, String sound) {
        super(name, gender);
        this.cage = cage;
        this.lastFedDay = lastFedDay;
        this.birthCountry = birthCountry;
        this.childCount = childCount;
        this.sound = sound;
    }


    public String getCage() {
        return cage;
    }

    public String getLastFedDay() {
        return lastFedDay;
    }

    public String getBirthCountry() {
        return birthCountry;
    }

    public int getChildCount() {
        return childCount;
    }

    public String getSound() {
        return sound;
    }

    @Override
    public void makeSound() {
        super.makeSound();
        System.out.println("Animal is " + this.sound);
    }
}
