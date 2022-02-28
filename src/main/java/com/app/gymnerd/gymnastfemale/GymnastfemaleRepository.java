package com.app.gymnerd.gymnastfemale;

import org.springframework.data.jpa.repository.JpaRepository;

public interface GymnastfemaleRepository extends JpaRepository<Gymnastfemale, Long> {
    public Gymnastfemale findByFirstname(String firstname);
}
