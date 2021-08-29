package com.template.api.apitemplate.api.controller.impl;

import com.template.api.apitemplate.api.controller.PlayerCard;
import com.template.api.apitemplate.api.model.dto.request.PlayerRequest;
import com.template.api.apitemplate.api.model.dto.response.PlayerResponse;
import com.template.api.apitemplate.api.model.mapper.PlayerMapper;
import com.template.api.apitemplate.api.service.PlayerCardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("playercard")
public class PlayerCardController implements PlayerCard {

    @Autowired
    private PlayerCardService playerCardService;

    @Autowired
    private PlayerMapper mapper;

    @GetMapping ("all")
    @Override
    public ResponseEntity<List<PlayerResponse>> getAll() {
        return new ResponseEntity<>(
                mapper.mapToDto(playerCardService.getAllPlayers()),
                HttpStatus.OK
        );
    }

    @GetMapping("byname")
    @Override
    public ResponseEntity<PlayerResponse> getByName(@RequestParam String name) throws Exception {
        return new ResponseEntity<>(
                mapper.mapToDto(playerCardService.getPlayByName(name)),
                HttpStatus.OK
        );
    }

    @PostMapping("add")
    @Override
    public ResponseEntity<Void> add(@RequestBody PlayerRequest playerRequest) throws Exception {
        playerCardService.add(mapper.mapToDomain(playerRequest));
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
