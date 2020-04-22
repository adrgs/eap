package models;

public class Student {
    private Integer id;
    private String nume;
    private String username;
    private Integer idFacultate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getIdFacultate() {
        return idFacultate;
    }

    public void setIdFacultate(Integer idFacultate) {
        this.idFacultate = idFacultate;
    }

    public Student(Integer id, String nume, String username, Integer idFacultate) {
        this.id = id;
        this.nume = nume;
        this.username = username;
        this.idFacultate = idFacultate;
    }

    public Student(String nume, String username, Integer idFacultate) {
        this.nume = nume;
        this.username = username;
        this.idFacultate = idFacultate;
    }
}
