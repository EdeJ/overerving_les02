package nl.novi.javaprogrammeren.overerving;


public class Animal {

    private String name;
    private String gender;

    public Animal(String name, String gender) {
        this.name = name;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public void move() {
        System.out.println("Animal has moved 0.25 meter");
    }

    public void makeSound() {
        System.out.println("Animal makes sound");
    }

    public void sleep() {
        System.out.println("Sleep 8 hours");
    }

    public void eat(String food) {
        System.out.println("Eating " + food);
    }
}
