package com.dtu.Roborally.controller;

import com.dtu.Roborally.model.GameInfo;
import com.dtu.Roborally.model.Player;
import com.dtu.Roborally.repository.GameInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping("/gameInfos")
public class GameInfoController {

    private GameInfoRepository gameInfoRepository;

    @Autowired
    public GameInfoController(GameInfoRepository gameInfoRepository) {
        this.gameInfoRepository = gameInfoRepository;
    }


    @PostMapping
    public boolean addGame(@RequestBody GameInfo gameInfo) {
        gameInfoRepository.save(gameInfo);
        return true;
    }

    @GetMapping("/{id}")
    public ResponseEntity<GameInfo> getGameInfoById(@PathVariable("id") Long id){
        GameInfo p = gameInfoRepository.getGameInfoById(id);
        return ResponseEntity.ok().body(p);
    }
}
