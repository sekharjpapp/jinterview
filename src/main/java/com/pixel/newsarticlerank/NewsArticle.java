package com.pixel.newsarticlerank;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class NewsArticle {
    private String title;
    private int readerCount;
}
