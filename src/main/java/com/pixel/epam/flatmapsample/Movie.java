package com.pixel.epam.flatmapsample;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Movie {

    private int id;
    private String name;
    private List<Director> directors;
}
