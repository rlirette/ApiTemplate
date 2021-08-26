package com.template.api.apitemplate.api.controller.impl;

import com.template.api.apitemplate.api.controller.PlayerCard;
import com.template.api.apitemplate.api.model.dto.response.PlayerDto;
import com.template.api.apitemplate.api.model.mapper.PlayerMapper;
import com.template.api.apitemplate.api.service.PlayerCardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/template")
public class PlayerCardController implements PlayerCard {

    @Autowired
    private PlayerCardService playerCardService;

    @Autowired
    private PlayerMapper mapper;

    @GetMapping ("all")
    @Override
    public ResponseEntity<List<PlayerDto>> getAllPlayers() {
        return new ResponseEntity<>(
                mapper.mapToDto(playerCardService.getAllPlayers()),
                HttpStatus.OK
        );
    }

    @GetMapping("byname")
    @Override
    public ResponseEntity<PlayerDto> getPlayByName(String name) {
        return new ResponseEntity<>(
                mapper.mapToDto(playerCardService.getPlayByName(name)),
                HttpStatus.OK
        );
    }
}
