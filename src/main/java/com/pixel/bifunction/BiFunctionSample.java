package com.pixel.bifunction;

import org.springframework.web.util.UriComponentsBuilder;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;

public class BiFunctionSample {
    public static void main(String[] args) {
        // Example usage of BiFunction
        java.util.function.BiFunction<Integer, Integer, Integer> add = (a, b) -> a + b;
        int result = add.apply(5, 10);
        System.out.println("Result of addition: " + result);

        String baseUrl = "https://api.example.com/search";

        Map<String, String> queryParams = new HashMap<>();
        queryParams.put("q", "java");
        queryParams.put("page", "1");
        queryParams.put("sort", "relevance");

        String finalUrl = buildUrlWithParams(queryParams, baseUrl);

        System.out.println("Final URL: " + finalUrl);
    }

    public static String buildUrlWithParams(Map<String, String> params, String baseUrl) {
        UriComponentsBuilder uriBuilder = UriComponentsBuilder.fromUriString(baseUrl);
        params.forEach(uriBuilder::queryParam);
        return uriBuilder.toUriString();
    }

}
