package com.brekol.model;

import javax.persistence.*;

/**
 * Created with IntelliJ IDEA.
 * User: Breku
 * Date: 12.03.13
 * Time: 20:47
 * To change this template use File | Settings | File Templates.
 */
@Entity
@Table(name = "USER")
public class User {

    @Id
    private Long id;

    @Column(name = "USERNAME")
    private String username;

    public User(String username) {
        this.username = username;
    }

    public User() {
    }



    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
