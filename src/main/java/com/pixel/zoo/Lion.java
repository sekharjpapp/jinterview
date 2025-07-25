package com.pixel.zoo;

public class Lion extends Animal {
    public void testAccess() {
        Animal animal = new Animal();
        animal.eat();  // COMPILATION ERROR
        // Cannot access protected method through parent class instance
        // Can only access through 'this' or 'super'
    }
}
