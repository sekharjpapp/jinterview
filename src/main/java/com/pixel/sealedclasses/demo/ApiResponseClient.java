package com.pixel.sealedclasses.demo;

public class ApiResponseClient {
    public static void main(String[] args) {
        ApiResponse<String> response = ApiResponse.success("Hello World");
        ApiResponse<Void> processing = ApiResponse.processing();
        ApiResponse<Void> failure = ApiResponse.failure(new RuntimeException("Error"));
    }
}
