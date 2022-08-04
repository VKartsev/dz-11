package ru.netology;

public class FilmManager {
    public FilmItem[] items = new FilmItem[0];
    private int maxLast;

    public FilmManager() {
        maxLast = 10;
    }

    public FilmManager(int maxLast) {
        this.maxLast = maxLast;
    }

    public void save(FilmItem item) {
        int length = items.length + 1;
        FilmItem[] tmp = new FilmItem[length];
        System.arraycopy(items, 0, tmp, 0, items.length);
        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = item;
        items = tmp;
    }

    public FilmItem[] findAll() {
        return items;
    }

    public FilmItem[] findLast() {
        int length = items.length;
        int resultLength;
        if (maxLast > length) {
            resultLength = length;
        } else {
            resultLength = maxLast;
        }
        FilmItem[] tmp = new FilmItem[resultLength];
        int index = 0;

        for (int i = length - 1; i >= length - resultLength; i--) {
            FilmItem item = items[i];
            tmp[index] = item;
            index++;
        }
        return tmp;
    }

}
