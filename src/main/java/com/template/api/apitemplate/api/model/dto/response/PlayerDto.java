package com.template.api.apitemplate.api.model.dto.response;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiParam;
import lombok.Getter;
import lombok.Setter;

@ApiModel (value = "NBA Player card")
@Getter
@Setter
public class PlayerDto {

    @ApiModelProperty (value = "Full name")
    private String name;

    @ApiModelProperty(value = "Position on the court")
    private String post;

    @ApiModelProperty(value = "Playmaking from 0 to 99", allowableValues = "range[0, 99]")
    private int level;
}
