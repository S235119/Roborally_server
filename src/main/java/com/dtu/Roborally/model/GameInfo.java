package com.dtu.Roborally.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
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
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int turnID;

    private String board;

    private enum phase {WAITING, PROGRAMMING, EXECUTION}

    private phase phase;

    @OneToMany(mappedBy = "gameInfo")
    @JsonManagedReference
    private List<Player> players;

}
