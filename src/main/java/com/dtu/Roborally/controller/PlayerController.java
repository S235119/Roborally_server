package com.dtu.Roborally.controller;

import com.dtu.Roborally.model.Player;
import com.dtu.Roborally.repository.GameInfoRepository;
import com.dtu.Roborally.repository.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/players")
public class PlayerController {

    private PlayerRepository playerRepository;

    @Autowired
    public PlayerController(PlayerRepository playerRepository) {
        this.playerRepository = playerRepository;
    }

    @PostMapping
    public boolean addPlayer(@RequestBody Player player){
        playerRepository.save(player);
        return true;
    }




}
