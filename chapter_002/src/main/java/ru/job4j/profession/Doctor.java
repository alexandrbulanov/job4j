package ru.job4j.profession;

/**
 * Class Doctor класс.
 *
 * author Aleksandr Bulanov (bulanov.alexander@mail.ru).
 * @version $Id$.
 * @since 0.1.
 */

public class Doctor extends Profession {
    public Doctor(String name, String profession) {
        super(name, profession);
    }

    Diagnosis treat(Patient patient) {
        Diagnosis diagnosis = new Diagnosis("name");
        return diagnosis;
    }
}
