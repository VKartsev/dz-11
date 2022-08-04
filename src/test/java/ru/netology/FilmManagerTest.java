package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FilmManagerTest {

    FilmItem first = new FilmItem(1, "Titanic");
    FilmItem second = new FilmItem(2, "Matrix");
    FilmItem third = new FilmItem(3, "Forrest Gump");
    FilmItem fourth = new FilmItem(4, "Terminator");
    FilmItem fifth = new FilmItem(5, "Ghost");
    FilmItem sixth = new FilmItem(6, "Basic Instinct");
    FilmItem seventh = new FilmItem(7, "The Silence of the Lambs");
    FilmItem eighth = new FilmItem(8, "The Green Mile");
    FilmItem ninth = new FilmItem(9, "Knockin On Heavens Door");
    FilmItem tenth = new FilmItem(10, "The Fifth Element");
    FilmItem eleventh = new FilmItem(11, "Men in Black");
    FilmItem twelfth = new FilmItem(12, "Fight Club");

    @Test
    public void shouldFindAll() {
        FilmManager manager = new FilmManager();
        manager.save(first);
        manager.save(second);
        manager.save(third);
        manager.save(fourth);
        manager.save(fifth);
        manager.save(sixth);
        manager.save(seventh);
        manager.save(eighth);
        manager.save(ninth);
        manager.save(tenth);
        manager.save(eleventh);
        manager.save(twelfth);

        FilmItem[] actual = manager.findAll();
        FilmItem[] expected = {first, second, third, fourth, fifth, sixth, seventh, eighth, ninth, tenth, eleventh, twelfth};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLastN() {
        FilmManager manager = new FilmManager();
        manager.save(first);
        manager.save(second);
        manager.save(third);
        manager.save(fourth);
        manager.save(fifth);
        manager.save(sixth);
        manager.save(seventh);
        manager.save(eighth);
        manager.save(ninth);
        manager.save(tenth);
        manager.save(eleventh);
        manager.save(twelfth);

        FilmItem[] actual = manager.findLast();
        FilmItem[] expected = {twelfth, eleventh, tenth, ninth, eighth, seventh, sixth, fifth, fourth, third};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLastFive() {
        FilmManager manager = new FilmManager(5);
        manager.save(first);
        manager.save(second);
        manager.save(third);
        manager.save(fourth);
        manager.save(fifth);

        FilmItem[] actual = manager.findLast();
        FilmItem[] expected = {fifth, fourth, third, second, first};

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void shouldFindLastThree() {
        FilmManager manager = new FilmManager(5);
        manager.save(first);
        manager.save(second);
        manager.save(third);


        FilmItem[] actual = manager.findLast();
        FilmItem[] expected = {third, second, first};

        Assertions.assertArrayEquals(expected, actual);

    }
}
