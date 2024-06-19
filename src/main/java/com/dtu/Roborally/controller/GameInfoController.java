package com.dtu.Roborally.controller;

import com.dtu.Roborally.model.GameInfo;
import com.dtu.Roborally.model.Player;
import com.dtu.Roborally.repository.GameInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/gameInfos")
public class GameInfoController {

    private GameInfoRepository gameInfoRepository;

    @Autowired
    public GameInfoController(GameInfoRepository gameInfoRepository) {
        this.gameInfoRepository = gameInfoRepository;
    }


    @PostMapping
    public ResponseEntity<GameInfo> addGame(@RequestBody GameInfo gameInfo) {
        GameInfo newGameInfo = gameInfoRepository.save(gameInfo);
        return ResponseEntity.ok().body(newGameInfo);
    }

    @GetMapping("/{id}")
    public ResponseEntity<GameInfo> getGameInfoById(@PathVariable("id") Long id){
        GameInfo p = gameInfoRepository.getGameInfoById(id);
        return ResponseEntity.ok().body(p);
    }

    @PutMapping("/{id}")
    public ResponseEntity<String> updateGameInfo(@PathVariable("id") Long id, @RequestBody GameInfo gameInfo) {
        Optional<GameInfo> existingGameInfo = gameInfoRepository.findById(id);
        if (existingGameInfo.isPresent()) {
            // Update the existing player with new values
            GameInfo updatedGameInfo = existingGameInfo.get();
            updatedGameInfo.setPlayers(gameInfo.getPlayers());
            updatedGameInfo.setPhase(gameInfo.getPhase());

            // Save the updated player
            gameInfoRepository.save(updatedGameInfo);
            return ResponseEntity.ok().body("Player updated successfully");
        } else {
            return ResponseEntity.notFound().build();

        }
    }
}
