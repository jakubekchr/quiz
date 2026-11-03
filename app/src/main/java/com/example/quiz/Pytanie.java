package com.example.quiz;

public class Pytanie {
    private long idZdjecia;
    private String trescPytania;
    private boolean poprawnaOdpowiedz;
    private boolean czyPoprawnie;
    private String podpowiedz;

    // Konstruktor bez podpowiedzi
    public Pytanie(long idZdjecia, String trescPytania,
                   boolean poprawnaOdpowiedz) {
        this.idZdjecia = idZdjecia;
        this.trescPytania = trescPytania;
        this.poprawnaOdpowiedz = poprawnaOdpowiedz;
        this.czyPoprawnie = false;
        this.podpowiedz = "Nie ma";
    }

    // Konstruktor z podpowiedzią
    public Pytanie(long idZdjecia, String trescPytania,
                   boolean poprawnaOdpowiedz, String podpowiedz) {
        this.idZdjecia = idZdjecia;
        this.trescPytania = trescPytania;
        this.poprawnaOdpowiedz = poprawnaOdpowiedz;
        this.czyPoprawnie = false;
        this.podpowiedz = podpowiedz;
    }

    public long getIdZdjecia() {
        return idZdjecia;
    }

    public String getTrescPytania() {
        return trescPytania;
    }

    public boolean isPoprawnaOdpowiedz() {
        return poprawnaOdpowiedz;
    }

    public boolean isCzyPoprawnie() {
        return czyPoprawnie;
    }

    public void setCzyPoprawnie(boolean czyPoprawnie) {
        this.czyPoprawnie = czyPoprawnie;
    }

    public String getPodpowiedz() {
        return podpowiedz;
    }

    public void setPodpowiedz(String podpowiedz) {
        this.podpowiedz = podpowiedz;
    }
}