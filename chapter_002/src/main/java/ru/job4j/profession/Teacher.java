package ru.job4j.profession;

/**
 * Class Teacher класс.
 *
 * author Aleksandr Bulanov (bulanov.alexander@mail.ru).
 * @version $Id$.
 * @since 0.1.
 */

public class Teacher extends Profession {
    public Teacher(String name, String profession) {
        super(name, profession);
    }

    Subject learn(Student student) {
        Subject subject = new Subject("name");
        return subject;
    }
}
