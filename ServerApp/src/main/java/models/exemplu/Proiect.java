package models.exemplu;

public class Proiect {
    private int id;
    private String nume;
    private String numeCompanie;

    public Proiect() {
    }

    public Proiect(int id, String nume, String numeCompanie) {
        this.id = id;
        this.nume = nume;
        this.numeCompanie = numeCompanie;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getNumeCompanie() {
        return numeCompanie;
    }

    public void setNumeCompanie(String numeCompanie) {
        this.numeCompanie = numeCompanie;
    }

    @Override
    public String toString() {
        return "Proiect{" +
                "id=" + id +
                ", nume='" + nume + '\'' +
                ", numeCompanie='" + numeCompanie + '\'' +
                '}';
    }
}
