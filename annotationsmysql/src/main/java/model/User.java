package model;

import model.mysql.Column;
import model.mysql.Table;

import java.math.BigDecimal;
import java.sql.Date;

@Table(name="User")
public class User {
    @Column(name="id", primaryKey = true)
    private Integer id;

    @Column(name="username")
    private String username;

    @Column(name="email")
    private String email;

    @Column(name="email_confirmed")
    private Boolean emailConfirmed;

    @Column(name="password")
    private String password;

    @Column(name="enabled", hasDefaultValue = true)
    private Boolean enabled;

    @Column(name="deleted", hasDefaultValue = true)
    private Boolean deleted;

    @Column(name="balance", hasDefaultValue = true)
    private BigDecimal balance;

    @Column(name="type")
    private String type;

    @Column(name="date_created", hasDefaultValue = true)
    private Date dateCreated;

    @Column(name="description", nullable = true)
    private String description;

    @Column(name="avatar_url", nullable = true)
    private String avatarURL;

    public String getUsername() {
        return username;
    }

    public Integer getId() {
        return id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Boolean getEmailConfirmed() {
        return emailConfirmed;
    }

    public void setEmailConfirmed(Boolean emailConfirmed) {
        this.emailConfirmed = emailConfirmed;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public Boolean getDeleted() {
        return deleted;
    }

    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAvatarURL() {
        return avatarURL;
    }

    public void setAvatarURL(String avatarURL) {
        this.avatarURL = avatarURL;
    }

    public User(Integer id, String username, String email, Boolean emailConfirmed, String password, Boolean enabled, Boolean deleted, BigDecimal balance, String type, Date dateCreated, String description, String avatarURL) {
        this.id = id;
        this.username = username;
        this.email = email;
        this.emailConfirmed = emailConfirmed;
        this.password = password;
        this.enabled = enabled;
        this.deleted = deleted;
        this.balance = balance;
        this.type = type;
        this.dateCreated = dateCreated;
        this.description = description;
        this.avatarURL = avatarURL;
    }

    public User()
    {

    }
}
