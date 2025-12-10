package com.pixel.zoo;

public class Lion extends Animal {
    @Override
    protected void eat() {
        super.eat();
    }

    public void testAccess() {

        Animal animal = new Animal();
        animal.eat();  // COMPILATION ERROR
        // Cannot access protected method through parent class instance
        // Can only access through 'this' or 'super'
    }

    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.eat();
    }
}
