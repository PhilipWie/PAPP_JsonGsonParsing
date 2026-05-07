package com.philip.json_gsonparsing01.model;
import java.util.List;
public class Buch {
    String titel;
    int erscheinungsjahr;
    boolean gelesen;
    Autor autor = null;
    List<String> genres;

    public Buch(String titel, int erscheinungsjahr, boolean gelesen,Autor autor, List<String> genres) {
        this.titel = titel;
        this.erscheinungsjahr = erscheinungsjahr;
        this.gelesen = gelesen;
        this.autor = null;
        this.genres = genres;
    }
    public String getTitel() {
        return titel;
    }
    public String setTitel(String titel) {
        return this.titel = titel;
    }
    public int getErscheinungsjahr() {
        return erscheinungsjahr;
    }
    public int setErscheinungsjahr(int erscheinungsjahr) {
        return this.erscheinungsjahr = erscheinungsjahr;
    }
    public boolean getGelesen() {
        return gelesen;
    }
    public boolean setGelesen(boolean gelesen) {
        return this.gelesen = gelesen;
    }
    public Autor getAutor() {
        return autor;
    }
    public Autor setAutor(Autor autor) {
        return this.autor = autor;
    }
    public List<String> getGenres() {
        return genres;
    }
    public List<String> setGenres(List<String> genres) {
        return this.genres = genres;
    }

    public String toString() {
        return "Buch{" +
                "titel='" + titel + '\'' +
                "autor='" + autor.getName() + '\'' +
                ", erscheinungsjahr=" + erscheinungsjahr +
                ", gelesen=" + gelesen +
                ", autor=" + autor +
                ", genres=" + genres +
                '}';
    }
}