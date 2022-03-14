package com.app.gymnerd.riomale;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class Riomale {
    @Id
    @GeneratedValue

    Long id;

    // pommelhorse exercise
    Boolean golden_pommelhorse;
    Boolean silver_pommelhorse;
    Boolean bronze_pommerhorse;

    // floor exercise
    Boolean golden_floor;
    Boolean silver_floor;
    Boolean bronze_floor;

    // bars exercise
    Boolean golden_bars;
    Boolean silver_bars;
    Boolean bronze_bars;

    // horizontal bar exercise
    Boolean golden_hbar;
    Boolean silver_hbar;
    Boolean bronze_hbar;

    // vault exercise
    Boolean golden_vault;
    Boolean silver_vault;
    Boolean bronze_vault;

    // rings exercise
    Boolean golden_rings;
    Boolean silver_rings;
    Boolean bronze_rings;

    // team medals
    Boolean golden_team;
    Boolean silver_team;
    Boolean bronze_team;

    // individual medals
    Boolean golden_individual;
    Boolean silver_individual;
    Boolean bronze_individual;
}
