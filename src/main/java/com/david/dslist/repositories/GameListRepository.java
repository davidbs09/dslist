package com.david.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.david.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository <GameList, Long>{

}
