/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mephi.b22901.maven1;

import com.github.javafaker.Faker;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ivis2
 */
public class DataGenerator {
    private static Faker faker = new Faker();
    private static String[] levels = {"Низкий", "Средний", "Высокий", "Критический"};

    public static Heretic generateHeretic() {
        List<String> crimes = new ArrayList<>();
        int crimeCount = faker.random().nextInt(1, 4);
        
        for (int i = 0; i < crimeCount; i++) {
            crimes.add(faker.lorem().sentence());
        }
        
        return new Heretic(
            faker.name().fullName(),
            crimes,
            faker.address().cityName(),
            faker.idNumber().valid(),
            levels[faker.random().nextInt(levels.length)]
        );
    }
}
