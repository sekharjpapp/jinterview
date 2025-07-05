package com.pixel.j17venkat.factoryds;

public class FactoryDsSample {
    public static void call(Person person) {
        person.play();
    }
    public static void main(String[] args) {
        call(new DogPerson());
        call(new CatLover());
    }
}
class Pet{}
class Dog extends Pet{
    @Override
    public String toString() {
        return "a dog";
    }
}
class Cat extends Pet{
    @Override
    public String toString() {
        return "a cat";
    }
}
interface Person{
    Pet getPet();

    default void play() {
        System.out.println("Playing with " + getPet());
    }
}
class DogPerson implements Person {
    Pet dog = new Dog();

    public Pet getPet() {
        return dog;
    }
    @Override
    public void play() {
        System.out.println("Playing with " + getPet());
    }
}
class CatLover implements Person {
    Pet cat = new Cat();

    @Override
    public Pet getPet() {
        return cat;
    }

    @Override
    public void play() {
        System.out.println("Playing with " + getPet());
    }
}