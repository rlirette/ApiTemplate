package com.template.api.apitemplate.api.service;

import com.template.api.apitemplate.api.model.domain.Player;

import java.util.List;

public interface PlayerCardService {

    List<Player> getAllPlayers ();
    Player getPlayByName (String name) throws Exception;
    void add (Player player);
}
