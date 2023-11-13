package javaOOP.JavaOOP.interfaces.birthdayCelebration;

public class Citizen implements Person, Birthable, Identifiable {
    private String name;
    private int age;
    private String birthDate;
    private String id;

    public Citizen(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Citizen(String name, int age, String id, String birthDate) {
        this.name = name;
        this.age = age;
        this.id = id;
        this.birthDate = birthDate;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public String getBirthDate() {
        return birthDate;
    }

    @Override
    public String getId() {
        return id;
    }
}
