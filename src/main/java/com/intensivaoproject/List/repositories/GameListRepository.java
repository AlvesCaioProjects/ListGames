package com.intensivaoproject.List.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.intensivaoproject.List.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> {

}
