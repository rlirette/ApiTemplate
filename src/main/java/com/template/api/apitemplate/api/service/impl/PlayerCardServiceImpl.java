package com.template.api.apitemplate.api.service.impl;

import com.template.api.apitemplate.api.model.dao.PlayerDao;
import com.template.api.apitemplate.api.model.domain.Player;
import com.template.api.apitemplate.api.model.mapper.PlayerMapper;
import com.template.api.apitemplate.api.repository.PlayerCartRepository;
import com.template.api.apitemplate.api.service.PlayerCardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlayerCardServiceImpl implements PlayerCardService {

    @Autowired
    private PlayerCartRepository repository;

    @Autowired
    private PlayerMapper mapper;

    @Override
    public List<Player> getAllPlayers() {
        return mapper.mapToDomain(
                repository.findAll()
        );
    }

    @Override
    public Player getPlayByName(String name) throws Exception {
        return mapper.mapToDomain(
                repository.findDistinctByNameContainingIgnoreCase(name).orElse(new PlayerDao())
        );
    }

    @Override
    public void add(Player player) {
        repository.save(mapper.mapToDao(player));
    }
}
