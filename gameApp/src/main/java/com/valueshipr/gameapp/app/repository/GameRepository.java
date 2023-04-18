package com.valueshipr.gameapp.app.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.valueshipr.gameapp.app.model.Game;


@Repository
public interface GameRepository extends JpaRepository<Game, Long> {
	
}
