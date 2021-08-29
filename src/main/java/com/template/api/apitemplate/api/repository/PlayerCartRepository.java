package com.template.api.apitemplate.api.repository;

import com.template.api.apitemplate.api.model.dao.PlayerDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PlayerCartRepository extends JpaRepository<PlayerDao, Integer> {

    public Optional<PlayerDao> findDistinctByNameContainingIgnoreCase(String name);
}
