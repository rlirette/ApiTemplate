package com.template.api.apitemplate.api.controller;

import com.template.api.apitemplate.api.model.dto.PlayerDto;
import com.template.api.apitemplate.api.model.dto.request.PlayerRequest;
import com.template.api.apitemplate.api.model.dto.response.PlayerResponse;
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
    ResponseEntity<List<PlayerResponse>> getAll();

    @ApiOperation(value = "Get player card by name")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Success", response = PlayerDto.class),
            @ApiResponse(code = 500, message = "Fail")
    })
    ResponseEntity<PlayerResponse> getByName(String name) throws Exception;

    @ApiOperation(value = "Add player card")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Success"),
            @ApiResponse(code = 500, message = "Fail")
    })
    ResponseEntity<Void> add (PlayerRequest playerRequest) throws Exception;
}
