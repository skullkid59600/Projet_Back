package com.app.gymnerd.role;

import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {
    // public RoleRepository findById(Long id);
}
