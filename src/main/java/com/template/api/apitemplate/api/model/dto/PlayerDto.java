package com.template.api.apitemplate.api.model.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class PlayerDto {

    @ApiModelProperty (value = "Full name")
    private String name;

    @ApiModelProperty(value = "Position on the court")
    private String position;

    @ApiModelProperty(value = "Playmaking from 0 to 99", allowableValues = "range[0, 99]")
    private int level;
}
