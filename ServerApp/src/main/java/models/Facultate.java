package models;

public class Facultate {
    private Integer id;
    private String oras;
    private String nume;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOras() {
        return oras;
    }

    public void setOras(String oras) {
        this.oras = oras;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public Facultate(Integer id, String oras, String nume) {
        this.id = id;
        this.oras = oras;
        this.nume = nume;
    }

    @Override
    public String toString() {
        return "Facultate{" +
                "id=" + id +
                ", oras='" + oras + '\'' +
                ", nume='" + nume + '\'' +
                '}';
    }
}
