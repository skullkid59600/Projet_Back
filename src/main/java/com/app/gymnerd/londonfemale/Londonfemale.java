package com.app.gymnerd.londonfemale;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "FLONDON")
public class Londonfemale {
    @Id
    @GeneratedValue

    Long id;

    // Floor exercise
    Boolean golden_floor;
    Boolean silver_floor;
    Boolean bronze_floor;

    // vault exercise
    Boolean golden_vault;
    Boolean silver_vault;
    Boolean bronze_vault;

    // bars exercise
    Boolean golden_bars;
    Boolean silver_bars;
    Boolean bronze_bars;

    // beam exercise
    Boolean golden_beam;
    Boolean silver_beam;
    Boolean bronze_beam;

    // team medals
    Boolean golden_team;
    Boolean silver_team;
    Boolean bronze_team;

    //individual medals
    Boolean golden_individual;
    Boolean silver_individual;
    Boolean bronze_individual;

}
