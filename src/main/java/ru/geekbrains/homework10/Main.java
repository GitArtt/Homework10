package ru.geekbrains.homework10;

import java.sql.SQLOutput;
import java.util.*;

public class Main {

    public static void main(String[] args) {
//        Задание №1
        ArrayList<String> list = createList();
//        System.out.println(list);
        countList(list);
        System.out.println("");

//        Задание №2
        Phonebook book = new Phonebook();
        book.add("Volotov", "8236");
        book.add("Andreev", "7715");
        book.add("Volotov", "9910");

        System.out.println(book);
    }

    private static ArrayList<String> createList() {
        ArrayList<String> list = new ArrayList<>();
        list.add("кружка");
        list.add("ложка");
        list.add("жвачка");
        list.add("сережка");
        list.add("табуретка");
        list.add("ложка");
        list.add("кружка");
        list.add("вилка");
        list.add("ложка");
        list.add("кастрюля");
        return list;
    }

    private static void countList(ArrayList<String> list) {
        LinkedHashMap<String, Integer> countlist = new LinkedHashMap<>();
        for (String s : list) {
            if (!countlist.containsKey(s)) {
                countlist.put(s, 1);
            } else {
                countlist.put(s, countlist.get(s) + 1);
            }
        }
        for (String s : countlist.keySet()) {
            System.out.println(s + " " + countlist.get(s));
        }
    }
}

