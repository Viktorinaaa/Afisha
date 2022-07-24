package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AfishaManagerTest {
    @Test
    public void addTest() {
        AfishaManager manager = new AfishaManager();
        manager.addMovie("Фильм 1");
        manager.addMovie("Фильм 2");
        manager.addMovie("Фильм 3");

        String[] expected = {"Фильм 1", "Фильм 2", "Фильм 3"};
        String[] actual = manager.getStringArray();
        assertArrayEquals(expected, actual);
    }

    @Test
    public void limitConstTest() {
        AfishaManager manager = new AfishaManager();
        manager.addMovie("Фильм 1");
        manager.addMovie("Фильм 2");
        manager.addMovie("Фильм 3");
        manager.getStringArray();
        String[] expected = {"Фильм 3", "Фильм 2", "Фильм 1"};
        String[] actual = manager.limitMovies();
        assertArrayEquals(expected, actual);
    }

    @Test
    public void limitTest() {
        AfishaManager manager = new AfishaManager(2);
        manager.addMovie("Фильм 1");
        manager.addMovie("Фильм 2");
        manager.addMovie("Фильм 3");
        manager.getStringArray();
        String[] expected = {"Фильм 3", "Фильм 2"};
        String[] actual = manager.limitMovies();
        assertArrayEquals(expected, actual);
    }

}