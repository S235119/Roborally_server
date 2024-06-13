package com.dtu.Roborally.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "gameInfo")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class GameInfo {
    @Id
    private int gameID;

    private int turnID;

    private String board;

    @OneToMany(mappedBy = "gameInfo")
    private List<Player> players;

    // Method to add a player by ID
    public boolean addPlayer(int playerID) {
        if (this.players == null) {
            this.players = new ArrayList<>();
            return false;
        }
        Player player = new Player();
        player.setPlayerID(playerID);
        this.players.add(player); // Add the player to the list
        return true;
    }

}
