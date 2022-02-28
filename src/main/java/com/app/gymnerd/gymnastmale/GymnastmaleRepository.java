package com.app.gymnerd.gymnastmale;

import org.springframework.data.jpa.repository.JpaRepository;

public interface GymnastmaleRepository extends JpaRepository<Gymnastmale, Long> {
    public Gymnastmale findGymnastmaleByLastname(String lastname);
}
