package com.template.api.apitemplate.api.service.impl;

import com.template.api.apitemplate.api.model.dao.PlayerDao;
import com.template.api.apitemplate.api.model.domain.Player;
import com.template.api.apitemplate.api.model.mapper.PlayerMapper;
import com.template.api.apitemplate.api.service.PlayerCardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@Service
public class PlayerCardServiceImpl implements PlayerCardService {

    @Autowired
    private PlayerMapper playerMapper;

    @Override
    public List<Player> getAllPlayers() {
        return playerMapper.mapToDomain(
                Arrays.asList(mockedLebron(), mockedPaulGeorge())
        );
    }

    @Override
    public Player getPlayByName(String name) {
        return playerMapper.mapToDomain(mockedLebron());
    }

    private PlayerDao mockedLebron(){
        return PlayerDao.builder()
                .name("Lebron James")
                .post("3")
                .level(96)
                .build();
    }

    private PlayerDao mockedPaulGeorge(){
        return PlayerDao.builder()
                .name("Paul Goerge")
                .post("2")
                .level(95)
                .build();
    }
}
