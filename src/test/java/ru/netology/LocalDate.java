package ru.netology;

import java.time.format.DateTimeFormatter;

public class LocalDate {
    static String localDate (int days) {
        String localDate = java.time.LocalDate.now().plusDays(days).format(DateTimeFormatter.ofPattern("dd.MM.uuuu"));
        return localDate;
    }
}
