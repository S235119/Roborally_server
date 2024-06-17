package com.dtu.Roborally.repository;

import com.dtu.Roborally.model.GameInfo;
import com.dtu.Roborally.model.Player;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface GameInfoRepository extends JpaRepository<GameInfo, Long> {

    public GameInfo getByGameID(int gameID);

    @Query("SELECT p FROM Player p WHERE p.playerID = :playerID AND p.gameInfo.gameID = :gameID")
    Player getPlayerByPlayerIDAndGameID(@Param("playerID") int playerID, @Param("gameID") int gameID);

}
