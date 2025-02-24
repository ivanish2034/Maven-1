/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mephi.b22901.maven1;

import com.github.javafaker.Faker;

/**
 *
 * @author ivis2
 */
public class DataGenerator {
    private Faker faker = new Faker();
    private String[] levels = {"Низкий", "Средний", "Высокий", "Критический"};

    public Heretic generateHeretic() {
        return new Heretic(
            faker.name().fullName(),
            faker.lorem().sentence(),
            faker.address().cityName(),
            faker.idNumber().valid(),
            levels[faker.random().nextInt(levels.length)]
        );
    }
}
