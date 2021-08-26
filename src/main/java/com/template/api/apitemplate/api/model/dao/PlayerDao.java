package com.template.api.apitemplate.api.model.dao;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class PlayerDao {

    private String name;
    private String post;
    private int level;
}
