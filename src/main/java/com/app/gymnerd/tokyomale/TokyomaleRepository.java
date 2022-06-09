package com.app.gymnerd.tokyomale;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TokyomaleRepository extends JpaRepository<Tokyomale, Long> {
    //public Tokyomale findById(Long id);
}
