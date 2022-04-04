package com.app.gymnerd.londonfemale;

import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@NoArgsConstructor
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

    public Londonfemale(Long id, Boolean golden_floor, Boolean silver_floor, Boolean bronze_floor, Boolean golden_vault, Boolean silver_vault, Boolean bronze_vault, Boolean golden_bars, Boolean silver_bars, Boolean bronze_bars, Boolean golden_beam, Boolean silver_beam, Boolean bronze_beam, Boolean golden_team, Boolean silver_team, Boolean bronze_team, Boolean golden_individual, Boolean silver_individual, Boolean bronze_individual) {
        this.id = id;
        this.golden_floor = golden_floor;
        this.silver_floor = silver_floor;
        this.bronze_floor = bronze_floor;
        this.golden_vault = golden_vault;
        this.silver_vault = silver_vault;
        this.bronze_vault = bronze_vault;
        this.golden_bars = golden_bars;
        this.silver_bars = silver_bars;
        this.bronze_bars = bronze_bars;
        this.golden_beam = golden_beam;
        this.silver_beam = silver_beam;
        this.bronze_beam = bronze_beam;
        this.golden_team = golden_team;
        this.silver_team = silver_team;
        this.bronze_team = bronze_team;
        this.golden_individual = golden_individual;
        this.silver_individual = silver_individual;
        this.bronze_individual = bronze_individual;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Boolean getGolden_floor() {
        return golden_floor;
    }

    public void setGolden_floor(Boolean golden_floor) {
        this.golden_floor = golden_floor;
    }

    public Boolean getSilver_floor() {
        return silver_floor;
    }

    public void setSilver_floor(Boolean silver_floor) {
        this.silver_floor = silver_floor;
    }

    public Boolean getBronze_floor() {
        return bronze_floor;
    }

    public void setBronze_floor(Boolean bronze_floor) {
        this.bronze_floor = bronze_floor;
    }

    public Boolean getGolden_vault() {
        return golden_vault;
    }

    public void setGolden_vault(Boolean golden_vault) {
        this.golden_vault = golden_vault;
    }

    public Boolean getSilver_vault() {
        return silver_vault;
    }

    public void setSilver_vault(Boolean silver_vault) {
        this.silver_vault = silver_vault;
    }

    public Boolean getBronze_vault() {
        return bronze_vault;
    }

    public void setBronze_vault(Boolean bronze_vault) {
        this.bronze_vault = bronze_vault;
    }

    public Boolean getGolden_bars() {
        return golden_bars;
    }

    public void setGolden_bars(Boolean golden_bars) {
        this.golden_bars = golden_bars;
    }

    public Boolean getSilver_bars() {
        return silver_bars;
    }

    public void setSilver_bars(Boolean silver_bars) {
        this.silver_bars = silver_bars;
    }

    public Boolean getBronze_bars() {
        return bronze_bars;
    }

    public void setBronze_bars(Boolean bronze_bars) {
        this.bronze_bars = bronze_bars;
    }

    public Boolean getGolden_beam() {
        return golden_beam;
    }

    public void setGolden_beam(Boolean golden_beam) {
        this.golden_beam = golden_beam;
    }

    public Boolean getSilver_beam() {
        return silver_beam;
    }

    public void setSilver_beam(Boolean silver_beam) {
        this.silver_beam = silver_beam;
    }

    public Boolean getBronze_beam() {
        return bronze_beam;
    }

    public void setBronze_beam(Boolean bronze_beam) {
        this.bronze_beam = bronze_beam;
    }

    public Boolean getGolden_team() {
        return golden_team;
    }

    public void setGolden_team(Boolean golden_team) {
        this.golden_team = golden_team;
    }

    public Boolean getSilver_team() {
        return silver_team;
    }

    public void setSilver_team(Boolean silver_team) {
        this.silver_team = silver_team;
    }

    public Boolean getBronze_team() {
        return bronze_team;
    }

    public void setBronze_team(Boolean bronze_team) {
        this.bronze_team = bronze_team;
    }

    public Boolean getGolden_individual() {
        return golden_individual;
    }

    public void setGolden_individual(Boolean golden_individual) {
        this.golden_individual = golden_individual;
    }

    public Boolean getSilver_individual() {
        return silver_individual;
    }

    public void setSilver_individual(Boolean silver_individual) {
        this.silver_individual = silver_individual;
    }

    public Boolean getBronze_individual() {
        return bronze_individual;
    }

    public void setBronze_individual(Boolean bronze_individual) {
        this.bronze_individual = bronze_individual;
    }
}
