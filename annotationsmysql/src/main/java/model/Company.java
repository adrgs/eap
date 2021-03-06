package model;

import model.mysql.Column;
import model.mysql.Table;

import java.math.BigDecimal;
import java.sql.Date;

@Table(name="User")
public final class Company extends User {
    @Column(name="company_name")
    private String companyName;

    @Column(name="id_location")
    private Integer idLocation;

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public Integer getIdLocation() {
        return idLocation;
    }

    public void setIdLocation(Integer idLocation) {
        this.idLocation = idLocation;
    }

    public Company(Integer id, String username, String email, Boolean emailConfirmed, String password, Boolean enabled, Boolean deleted, BigDecimal balance, String type, Date dateCreated, String description, String avatarURL, String companyName, Integer idLocation) {
        super(id, username, email, emailConfirmed, password, enabled, deleted, balance, "Company", dateCreated, description, avatarURL);
        this.companyName = companyName;
        this.idLocation = idLocation;
    }
}
