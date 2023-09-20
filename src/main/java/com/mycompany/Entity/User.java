/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.Entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

/**
 *
 * @author MstfDryl
 */
@Entity(name="USER")
@NamedQueries({
    @NamedQuery(name="allUsers", query="SELECT u FROM USER u"),
    @NamedQuery(name="getXUser", query="SELECT u FROM USER u WHERE u.userName = :username"),
    @NamedQuery(name="getXEmail", query="SELECT u FROM USER u WHERE u.email = :email")
})
public class User implements Serializable {
    
    @Column(name="ID")
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @Column(name="USERNAME", length=200, nullable=false)
    private String username;
    
    @Column(name="PASSWORD", length=255, nullable=false)
    private String password;
    
    @Column(name="EMAIL", length=255, nullable=false)
    private String email;

    public User() {
    }

    public User(String username, String password, String email) {
        this.username = username;
        this.password = password;
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String userName) {
        this.username = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
}
