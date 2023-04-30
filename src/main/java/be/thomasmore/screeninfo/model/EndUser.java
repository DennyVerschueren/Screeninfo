package be.thomasmore.screeninfo.model;

import jakarta.persistence.*;

@Entity
public class EndUser {
    @SequenceGenerator(name = "UserSeqGen", sequenceName = "UserSeq", initialValue = 5, allocationSize = 1)
    @GeneratedValue(generator = "UserSeqGen")
    @Id
    private Integer id;
    private String username;
    private String password;
    private String role;

    public EndUser(String username, String password, String role) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.role = role;
    }

    public EndUser() {

    }

    public String  getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer
    getId() {
        return id;
    }


}
