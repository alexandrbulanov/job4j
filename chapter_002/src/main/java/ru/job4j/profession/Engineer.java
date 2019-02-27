package ru.job4j.profession;

/**
 * Class Engineer класс.
 *
 * author Aleksandr Bulanov (bulanov.alexander@mail.ru).
 * @version $Id$.
 * @since 0.1.
 */

public class Engineer extends Profession {
    public Engineer(String name, String profession) {
        super(name, profession);
    }

    Project bild(House house) {
        Project project = new Project("name");
        return project;
    }
}