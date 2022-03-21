package com.app.gymnerd.role;

import com.app.gymnerd.user.User;

import javax.persistence.*;

@Entity
@Table(name = "ROLE")
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "user_id")
    Long userId;

    @OneToOne
    @PrimaryKeyJoinColumn(name = "user_id")
    User user;

    @Column(name = "name")
    String name;

}
