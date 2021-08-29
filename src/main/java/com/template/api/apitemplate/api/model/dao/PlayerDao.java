package com.template.api.apitemplate.api.model.dao;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

@Entity (name = "player")
@Getter @Setter @NoArgsConstructor
public class PlayerDao implements Serializable {

    private static final long serialVersionUID = -176609452987168800L;

    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id private int id;
    private String name;
    private String position;
    private int level;
}
