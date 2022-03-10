package com.app.gymnerd.gymnastmale;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@NoArgsConstructor
//@AllArgsConstructor
@Data
@Entity
@Table(name = "MGYMNAST")
public class Gymnastmale {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String firstname;
    String lastname;
    String nickname;
    Boolean gender;
    String country;
    Date birthdate;
    String sociallinkone;
    String sociallinktwo;
    String img;
    // height
    // active years
    // medals

    public Gymnastmale(Long id, String firstname, String lastname, String nickname, Boolean gender, String country, Date birthdate, String sociallinkone, String sociallinktwo, String img) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.nickname = nickname;
        this.gender = gender;
        this.country = country;
        this.birthdate = birthdate;
        this.sociallinkone = sociallinkone;
        this.sociallinktwo = sociallinktwo;
        this.img = img;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public Boolean getGender() {
        return gender;
    }

    public void setGender(Boolean gender) {
        this.gender = gender;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    public String getSociallinkone() {
        return sociallinkone;
    }

    public void setSociallinkone(String sociallinkone) {
        this.sociallinkone = sociallinkone;
    }

    public String getSociallinktwo() {
        return sociallinktwo;
    }

    public void setSociallinktwo(String sociallinktwo) {
        this.sociallinktwo = sociallinktwo;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }
}
