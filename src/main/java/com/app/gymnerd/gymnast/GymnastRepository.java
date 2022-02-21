package com.app.gymnerd.gymnast;

import org.springframework.data.jpa.repository.JpaRepository;

public interface GymnastRepository extends JpaRepository<Gymnast, Long> {
    public Gymnast findByFirstname(String firstname);
}
