package com.valueshipr.gameapp.app.controller;
import java.net.URI;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.valueshipr.gameapp.app.model.Game;
import com.valueshipr.gameapp.app.service.GameService;

@RestController
public class GameController {

    @Autowired
    private GameService gameService;

    //Send the data in database URL : http://localhost9192/saveGame
    @PostMapping("/saveGame")
    public ResponseEntity<Game> createGame(@RequestBody Game game) {
        Game createdGame = gameService.createGame(game);
        return ResponseEntity.created(URI.create("/games/" + createdGame.getId())).body(createdGame);
    }

    //Retrieve the data from database URL : http://localhost9192/getAll
    @GetMapping("/getAll")
    public ResponseEntity<List<Game>> getAllGames() {
        List<Game> games = gameService.getAllGames();
        return ResponseEntity.ok(games);
    }

    //Retrieve the data from database using id URL : http://localhost9192/getById/{id}
    @GetMapping("/getById/{id}")
    public ResponseEntity<Game> getGameById(@PathVariable Long id) {
        Game game = gameService.getGameById(id);
        return ResponseEntity.ok(game);
    }

    //Update the data URL : http://localhost9192/updateGame/{id}
    @PutMapping("/updateGame/{id}")
    public ResponseEntity<Game> updateGame(@PathVariable Long id, @RequestBody Game game) {
        Game updatedGame = gameService.updateGame(id, game);
        return ResponseEntity.ok(updatedGame);
    }

    //Delete the data URL : http://localhost9192/deleteGame/{id}
    @DeleteMapping("/deleteGame/{id}")
    public ResponseEntity<Void> deleteGame(@PathVariable Long id) {
        gameService.deleteGame(id);
        return ResponseEntity.noContent().build();
    }
}