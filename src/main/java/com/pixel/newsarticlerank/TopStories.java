package com.pixel.newsarticlerank;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class TopStories {
    public static void main(String[] args) {
        // Create a list of news articles
        List<NewsArticle> articles = new ArrayList<>();
        articles.add(new NewsArticle("Artificial Intelligence and the Physics of Learning", 1500));
        articles.add(new NewsArticle("China's otherworldly mountains that inspired Avatar", 2300));
        articles.add(new NewsArticle("Global Markets Update: Inflation Eases", 900));
        articles.add(new NewsArticle("Breakthrough in Quantum Computing Achieved", 1800));
        articles.add(new NewsArticle("The Rise of Renewable Energy Sources", 1200));
        articles.add(new NewsArticle("Advances in Space Exploration and Colonization", 2000));
        articles.add(new NewsArticle("Cybersecurity Challenges in 2024", 1700));
        articles.add(new NewsArticle("Top Travel Destinations for 2024", 800));
        articles.add(new NewsArticle("The Future of Electric Vehicles", 1400));
        articles.add(new NewsArticle("Healthcare Innovations of the Decade", 1000));

        // Sort articles by reader count in descending order
        List<NewsArticle> topStories = articles.stream()
                .sorted(Comparator.comparingInt(NewsArticle::getReaderCount).reversed())
                .toList();

        // Display the top stories
        System.out.println("Today's Top Stories:");
        for (int i = 0; i < topStories.size(); i++) {
            System.out.printf("%d. %s%n", i + 1, topStories.get(i).getTitle());
        }
    }
}
