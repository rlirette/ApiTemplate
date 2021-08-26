package com.template.api.apitemplate.api.controller;

import com.template.api.apitemplate.api.model.dto.response.PlayerDto;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.http.ResponseEntity;

import java.util.List;

@Api(value = "Player Card")
public interface PlayerCard {

    @ApiOperation(value = "Get all player card")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Success", response = PlayerDto.class),
            @ApiResponse(code = 500, message = "Fail")
    })
    ResponseEntity<List<PlayerDto>> getAllPlayers ();

    @ApiOperation(value = "Get player card by name")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Success", response = PlayerDto.class),
            @ApiResponse(code = 500, message = "Fail")
    })
    ResponseEntity<PlayerDto> getPlayByName (String name);
}
