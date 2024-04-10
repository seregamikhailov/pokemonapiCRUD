package com.pokemonreview.api.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.pokemonreview.api.models.Role;
import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role,Integer> {
    Optional<Role> findByName(String name);
}
