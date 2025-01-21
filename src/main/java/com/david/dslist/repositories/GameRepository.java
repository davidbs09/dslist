package com.david.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.david.dslist.entities.Game;

public interface GameRepository extends JpaRepository <Game, Long>{

}
