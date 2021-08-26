package com.template.api.apitemplate.api.model.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
@Builder
public class Player {

    private String name;
    private String post;
    private int level;
}
