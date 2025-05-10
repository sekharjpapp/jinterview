package com.pixel.designpatterns;

import com.pixel.designpatterns.factory.Computer;
import com.pixel.designpatterns.factory.ComputerFactory;
import com.pixel.designpatterns.factory.GraphicsDecorator;
import com.pixel.designpatterns.factory.SecurityDecorator;

public class FactoryDP {
    public static void main(String[] args) {
        Computer pc = ComputerFactory.createComputer("PC", "16GB", "1TB", "AMD Ryzen", true, false);
        Computer laptop = ComputerFactory.createComputer("Laptop", "8GB", "512GB", "Intel i5", true, true);
        Computer server = ComputerFactory.createComputer("Server", "32GB", "2TB", "Intel Xeon", false, false);

        System.out.println("PC Config:: " + pc);
        System.out.println("Laptop Config:: " + laptop);
        System.out.println("Server Config:: " + server);
        System.out.println("***********************************************************");
        //
        // Create a basic PC
        Computer basicPC = ComputerFactory.createComputer("PC", "16GB", "1TB", "AMD Ryzen", true, false);
        System.out.println("Basic PC Config: " + basicPC);

        // Create a PC with enhanced graphics
        Computer graphicsPC = new GraphicsDecorator(basicPC);
        System.out.println("Graphics PC Config: " + graphicsPC);

        // Create a Laptop with enhanced security
        Computer basicLaptop = ComputerFactory.createComputer("Laptop", "8GB", "512GB", "Intel i5", true, true);
        Computer secureLaptop = new SecurityDecorator(basicLaptop);
        System.out.println("Secure Laptop Config: " + secureLaptop);

        // Create a Server with both graphics and security features
        Computer basicServer = ComputerFactory.createComputer("Server", "32GB", "2TB", "Intel Xeon", false, false);
        Computer graphicsAndSecureServer = new SecurityDecorator(new GraphicsDecorator(basicServer));
        System.out.println("Graphics and Secure Server Config: " + graphicsAndSecureServer);

    }
}
