package com.app.gymnerd.gymnast;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class Gymnast {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
}
