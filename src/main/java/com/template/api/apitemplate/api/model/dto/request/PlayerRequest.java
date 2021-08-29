package com.template.api.apitemplate.api.model.dto.request;

import com.template.api.apitemplate.api.model.dto.PlayerDto;
import io.swagger.annotations.ApiModel;

@ApiModel (value = "NBA Player card request", parent = PlayerDto.class)
public class PlayerRequest extends PlayerDto {
}
