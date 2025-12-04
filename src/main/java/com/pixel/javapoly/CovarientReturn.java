package com.pixel.javapoly;

public class CovarientReturn {
    public static void main(String[] args) {
        // Can the return type be changed while overriding a method?
        PetStore store = new CustomPetStore();
        Animal animal = store.getAnimal();
        System.out.println("Animal class: " + animal.getClass().getSimpleName());
    }
}
class Animal {}
class Dog extends Animal {}
class PetStore {
    Animal getAnimal() {
        return new Animal();
    }
}
class CustomPetStore extends PetStore {
    @Override
    Dog getAnimal() { // Covariant return type
        return new Dog();
    }
}