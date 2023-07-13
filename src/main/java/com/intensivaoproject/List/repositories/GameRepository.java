package com.intensivaoproject.List.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.intensivaoproject.List.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {

}
