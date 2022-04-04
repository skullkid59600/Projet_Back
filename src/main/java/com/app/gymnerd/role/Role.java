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

    public Role(Long userId, User user, String name) {
        this.userId = userId;
        this.user = user;
        this.name = name;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
