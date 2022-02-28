package com.app.gymnerd.gymnastfemale;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class Gymnastfemale {
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
}
