package com.dtu.Roborally.controller;

import com.dtu.Roborally.model.GameInfo;
import com.dtu.Roborally.model.Player;
import com.dtu.Roborally.repository.GameInfoRepository;
import com.dtu.Roborally.repository.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

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

    @PutMapping("/{id}")
    public ResponseEntity<String> updatePlayer(@PathVariable("id") Long id, @RequestBody Player p) {
        Optional<Player> existingPlayer = playerRepository.findById(id);
        if (existingPlayer.isPresent()) {
            // Update the existing player with new values
            Player updatedPlayer = existingPlayer.get();
            updatedPlayer.setPlayerName(p.getPlayerName());
            updatedPlayer.setProgram1(p.getProgram1());
            updatedPlayer.setProgram2(p.getProgram2());
            updatedPlayer.setProgram3(p.getProgram3());
            updatedPlayer.setProgram4(p.getProgram4());
            updatedPlayer.setProgram5(p.getProgram5());
            updatedPlayer.setProgrammingDone(p.isProgrammingDone());

            // Save the updated player
            playerRepository.save(updatedPlayer);
            return ResponseEntity.ok().body("Player updated successfully");
        } else {
            return ResponseEntity.notFound().build();
        }
    }


}
