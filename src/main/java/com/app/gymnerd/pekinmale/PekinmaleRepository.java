package com.app.gymnerd.pekinmale;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PekinmaleRepository extends JpaRepository<Pekinmale, Long> {
    //public Pekinmale findById(Long id);
}
