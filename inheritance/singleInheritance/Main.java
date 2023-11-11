package oop.inheritance.singleInheritance;

import oop.inheritance.singleInheritance.Cat;
import oop.inheritance.singleInheritance.Dog;

public class Main {
    public static void main(String[] args) {

        Dog dog = new Dog();
        dog.eat();
        dog.bark();

        Cat cat = new Cat();
        cat.eat();
        cat.meow();
    }
}
