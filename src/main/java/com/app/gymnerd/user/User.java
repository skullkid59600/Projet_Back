package com.app.gymnerd.user;

import com.app.gymnerd.role.Role;

import javax.persistence.*;

@Entity
@Table(name = "USERS")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "id")
    Long id;

    @Column(name = "login")
    String login;

    @Column(name = "password")
    String password;

    @OneToOne(mappedBy = "user")
    Role role;
}
