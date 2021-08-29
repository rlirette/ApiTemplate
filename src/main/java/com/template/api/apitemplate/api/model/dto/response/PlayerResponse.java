package com.template.api.apitemplate.api.model.dto.response;

import com.template.api.apitemplate.api.model.dto.PlayerDto;
import io.swagger.annotations.ApiModel;

@ApiModel (value = "NBA Player card response", parent = PlayerDto.class)
public class PlayerResponse extends PlayerDto {
}
