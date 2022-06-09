package com.app.gymnerd.content;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ContentRepository extends JpaRepository<Content, Long> {
    public Content findByTitle(String title);
}