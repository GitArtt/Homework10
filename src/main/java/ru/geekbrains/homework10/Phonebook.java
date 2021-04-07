package ru.geekbrains.homework10;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeMap;

public class Phonebook {

    private TreeMap<String, Set<String>> book = new TreeMap<>();

    public void add(String surname, String number) {
        Set<String> phones = getPhones(surname);
        phones.add(number);
    }

    private Set<String> getPhones(String surname) {
        return book.computeIfAbsent(surname, key -> new HashSet<>());
    }

    public Set<String> get(String surname) {
        return getPhones(surname);
    }

    @Override
    public String toString() {
        return "Phonebook:\n" + book;
    }
}
