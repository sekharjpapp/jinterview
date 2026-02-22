package com.pixel.constructorchaining;

public class UserClient {
    public static void main(String[] args) {
        User user = User.builder()
                .id("U101")
                .name("Sekhar")
                .address("India")
                .build();

        System.out.println(user);
    }
}
