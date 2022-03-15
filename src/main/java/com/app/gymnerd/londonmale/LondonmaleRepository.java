package com.app.gymnerd.londonmale;

import org.springframework.data.jpa.repository.JpaRepository;

public interface LondonmaleRepository extends JpaRepository<Londonmale, Long> {
    //public Londonmale findByGolden_floor(Boolean golden_floor);
}
