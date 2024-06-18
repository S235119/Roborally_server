package com.dtu.Roborally.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "player")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Player {

    @Id
    private String playerID;

    private String program1;
    private String program2;
    private String program3;
    private String program4;
    private String program5;

    @ManyToOne
    private GameInfo gameInfo;


}
