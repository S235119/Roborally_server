package com.dtu.Roborally.repository;

import com.dtu.Roborally.model.GameInfo;
import com.dtu.Roborally.model.Player;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

public interface PlayerRepository extends JpaRepository<Player, Long> {

}
