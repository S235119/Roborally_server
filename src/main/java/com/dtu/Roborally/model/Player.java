package com.dtu.Roborally.model;

import jakarta.persistence.*;
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
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String playerName;
    private String program1;
    private String program2;
    private String program3;
    private String program4;
    private String program5;
    private boolean programmingDone;

    @ManyToOne
    private GameInfo gameInfo;


}
