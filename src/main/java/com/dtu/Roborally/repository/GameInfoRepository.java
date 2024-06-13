package com.dtu.Roborally.repository;

import com.dtu.Roborally.model.GameInfo;
import com.dtu.Roborally.model.Player;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface GameInfoRepository extends JpaRepository<GameInfo, Long> {

    public GameInfo findByGameID(int gameID);

    //Fungerer ikke endnu
    //public int getTurnID(int turnID);

    //Fungerer ikke endnu
    //public String findBoard(int gameID);

    //Fungerer ikke endnu
    //@Modifying
    //public void updateProgram(int playerID, String program);

    //Fungerer ikke endnu
    //public GameInfo setPlayerProgram(int playerID, int gameID);

    //Fungerer ikke endnu
    //public GameInfo addNewGame(int gameID, String board);

    //Fungerer ikke endnu
    //public void addPlayer(int playerID, int gameID);

}
