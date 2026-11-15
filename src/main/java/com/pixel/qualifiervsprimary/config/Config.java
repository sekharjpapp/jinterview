package com.pixel.qualifiervsprimary.config;

import com.pixel.qualifiervsprimary.ContentStrategy;
import com.pixel.qualifiervsprimary.ImageContentStrategy;
import com.pixel.qualifiervsprimary.VideoContentStrategy;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class Config {

    @Bean
    public ContentStrategy videoContentStrategy() {
        return new VideoContentStrategy();
    }
    @Bean
    @Primary
    public ContentStrategy imageContentStrategy() {
        return new ImageContentStrategy();
    }

}
