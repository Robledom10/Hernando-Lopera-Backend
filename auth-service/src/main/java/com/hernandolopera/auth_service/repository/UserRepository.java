package com.hernandolopera.auth_service.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.hernandolopera.auth_service.model.User;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByUsername(String username);

    boolean existsByUsername(String username);

    boolean existsByEmail(String email);
}
