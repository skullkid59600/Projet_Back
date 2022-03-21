package com.app.gymnerd.tokyomale;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@NoArgsConstructor
@Data
@Entity
@Table(name = "MTOKYO")
public class Tokyomale {
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

    public Tokyomale(Long id, Boolean golden_pommelhorse, Boolean silver_pommelhorse, Boolean bronze_pommerhorse, Boolean golden_floor, Boolean silver_floor, Boolean bronze_floor, Boolean golden_bars, Boolean silver_bars, Boolean bronze_bars, Boolean golden_hbar, Boolean silver_hbar, Boolean bronze_hbar, Boolean golden_vault, Boolean silver_vault, Boolean bronze_vault, Boolean golden_rings, Boolean silver_rings, Boolean bronze_rings, Boolean golden_team, Boolean silver_team, Boolean bronze_team, Boolean golden_individual, Boolean silver_individual, Boolean bronze_individual) {
        this.id = id;
        this.golden_pommelhorse = golden_pommelhorse;
        this.silver_pommelhorse = silver_pommelhorse;
        this.bronze_pommerhorse = bronze_pommerhorse;
        this.golden_floor = golden_floor;
        this.silver_floor = silver_floor;
        this.bronze_floor = bronze_floor;
        this.golden_bars = golden_bars;
        this.silver_bars = silver_bars;
        this.bronze_bars = bronze_bars;
        this.golden_hbar = golden_hbar;
        this.silver_hbar = silver_hbar;
        this.bronze_hbar = bronze_hbar;
        this.golden_vault = golden_vault;
        this.silver_vault = silver_vault;
        this.bronze_vault = bronze_vault;
        this.golden_rings = golden_rings;
        this.silver_rings = silver_rings;
        this.bronze_rings = bronze_rings;
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

    public Boolean getGolden_pommelhorse() {
        return golden_pommelhorse;
    }

    public void setGolden_pommelhorse(Boolean golden_pommelhorse) {
        this.golden_pommelhorse = golden_pommelhorse;
    }

    public Boolean getSilver_pommelhorse() {
        return silver_pommelhorse;
    }

    public void setSilver_pommelhorse(Boolean silver_pommelhorse) {
        this.silver_pommelhorse = silver_pommelhorse;
    }

    public Boolean getBronze_pommerhorse() {
        return bronze_pommerhorse;
    }

    public void setBronze_pommerhorse(Boolean bronze_pommerhorse) {
        this.bronze_pommerhorse = bronze_pommerhorse;
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

    public Boolean getGolden_hbar() {
        return golden_hbar;
    }

    public void setGolden_hbar(Boolean golden_hbar) {
        this.golden_hbar = golden_hbar;
    }

    public Boolean getSilver_hbar() {
        return silver_hbar;
    }

    public void setSilver_hbar(Boolean silver_hbar) {
        this.silver_hbar = silver_hbar;
    }

    public Boolean getBronze_hbar() {
        return bronze_hbar;
    }

    public void setBronze_hbar(Boolean bronze_hbar) {
        this.bronze_hbar = bronze_hbar;
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

    public Boolean getGolden_rings() {
        return golden_rings;
    }

    public void setGolden_rings(Boolean golden_rings) {
        this.golden_rings = golden_rings;
    }

    public Boolean getSilver_rings() {
        return silver_rings;
    }

    public void setSilver_rings(Boolean silver_rings) {
        this.silver_rings = silver_rings;
    }

    public Boolean getBronze_rings() {
        return bronze_rings;
    }

    public void setBronze_rings(Boolean bronze_rings) {
        this.bronze_rings = bronze_rings;
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
