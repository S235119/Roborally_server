package com.dtu.Roborally.repository;

import com.dtu.Roborally.model.GameInfo;
import com.dtu.Roborally.model.Player;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * @author Amalie Bojsen, s235119@dtu.dk, Rebecca Moss, s225042@dtu.dk
 */
public interface GameInfoRepository extends JpaRepository<GameInfo, Long> {

    /**
     *
     * @param id
     * @return GameInfo
     */
    public GameInfo getGameInfoById(Long id);

    /*@Query("SELECT p FROM Player p WHERE p.playerID = :playerID AND p.gameInfo.gameID = :gameID")
    Player getPlayerByPlayerIDAndGameID(@Param("playerID") String playerID, @Param("gameID") int gameID);
*/
}
