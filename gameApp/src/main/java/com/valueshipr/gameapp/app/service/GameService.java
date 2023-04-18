package com.valueshipr.gameapp.app.service;

import java.util.List;

import com.valueshipr.gameapp.app.model.Game;

public interface GameService {
    List<Game> getAllGames();
    Game createGame(Game game);
    Game updateGame(Long id, Game game);
    void deleteGame(Long id);
	Game getGameById(Long id);
}
