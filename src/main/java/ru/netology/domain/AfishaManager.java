package ru.netology.domain;

public class AfishaManager {
    private int limit;

    public AfishaManager(int limit) {
        this.limit = limit;
    }

    public AfishaManager() {
        limit = 10;
    }

    private String[] movies = new String[0];

    //Добавление фильма
    public void addMovie(String movie) {
        String[] tmp = new String[movies.length + 1];
        for (int i = 0; i < movies.length; i++) {
            tmp[i] = movies[i];
        }
        tmp[tmp.length - 1] = movie;
        movies = tmp;
    }

    //Вывод всех фильмов в порядке добавления
    public String[] getStringArray() {
        return movies;
    }

    //Вывод ограниченного числа последних добавленных фильмов в обратном порядке
    public String[] limitMovies() {
        int resultLength;    //желаемый размер создаваемого массива
        if (movies.length < limit) {
            resultLength = movies.length;
        } else {
            resultLength = limit;
        }

        String[] result = new String[resultLength];
        for (int i = 0; i < resultLength; i++) {
            result[i] = movies[movies.length - 1 - i];
        }
        return result;

    }

}
