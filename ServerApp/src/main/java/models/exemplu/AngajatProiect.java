package models.exemplu;

public class AngajatProiect {
    private int idAngajat;
    private int idProiect;

    public AngajatProiect() {
    }

    public AngajatProiect(int idAngajat, int idProiect) {
        this.idAngajat = idAngajat;
        this.idProiect = idProiect;
    }

    public int getIdAngajat() {
        return idAngajat;
    }

    public void setIdAngajat(int idAngajat) {
        this.idAngajat = idAngajat;
    }

    public int getIdProiect() {
        return idProiect;
    }

    public void setIdProiect(int idProiect) {
        this.idProiect = idProiect;
    }

    @Override
    public String toString() {
        return "AngajatProiect{" +
                "idAngajat=" + idAngajat +
                ", idProiect=" + idProiect +
                '}';
    }
}
