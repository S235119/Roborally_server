package com.dtu.Roborally.repository;

import com.dtu.Roborally.model.GameInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameInfoRepository extends JpaRepository<GameInfo, Long> {

    public GameInfo findByGameID(int gameID);

    public int getTurnID(int gameID);

    public String getBoard(int gameID);

    public void updateProgram(int playerID, String program);

    public GameInfo setPlayerProgram(int playerID, int gameID);

    public GameInfo addNewGame(int gameID, String board);

    public void addPlayer(int playerID, int gameID);

}
