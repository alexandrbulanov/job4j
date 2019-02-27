package ru.job4j.profession;

/**
 * Class Patient класс.
 *
 * author Aleksandr Bulanov (bulanov.alexander@mail.ru).
 * @version $Id$.
 * @since 0.1.
 */

public class Patient {
    private String name;
    private String complaint;

    public Patient(String name, String complaint) {
        this.name = name;
        this.complaint = complaint;
    }
}