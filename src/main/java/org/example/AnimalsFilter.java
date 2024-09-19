package org.example;

import java.util.List;
import java.util.stream.Collectors;

public class AnimalsFilter {
    public static List<Animal> FilterByAge(List<Animal> animals, int minAge) {
        return animals.stream()
                .filter(animal -> animal.age > minAge)
                .collect(Collectors.toList());
    }
}
