package com.example.guessNumber.Model;

import com.example.guessNumber.Model.Game;

import java.util.List;


public interface gameDAO {

    //C - CREATE
    Game add(Game game);

    //R - READONE
    Game findById(int Id);

    //R - READALL
    List<Game> getAll();

    //U - UPDATE
    //true if game exists and is updated
    boolean update(Game game);

    //D - DELETE
    //true if game exists and is deleted
    boolean deleteById(int Id);
}