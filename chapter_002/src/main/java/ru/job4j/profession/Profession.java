package ru.job4j.profession;

/**
 * Class Profession родительский класс.
 *
 * @author Aleksandr Bulanov (bulanov.alexander@mail.ru).
 * @version $Id$.
 * @since 0.1.
 */

public class Profession {

    /**
     * @param поле profession.
     * @param поле name.
     */
    public Profession(String name, String profession) {
        this.name = name;
        this.profession = profession;
    }
}
