package com.pixel.j8optionals.secondone;

public class UserClient {
    public static void main(String[] args) {
        UserService userService = new UserService();
        User user = userService.getUserById(4);
        if (user != null) {
            System.out.println("Id => " + user.getId() + " Name => " + user.getName());
        } else {
            System.out.println("User not found");
        }
    }
}
