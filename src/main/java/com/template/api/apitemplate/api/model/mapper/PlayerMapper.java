package com.template.api.apitemplate.api.model.mapper;

import com.template.api.apitemplate.api.model.dao.PlayerDao;
import com.template.api.apitemplate.api.model.domain.Player;
import com.template.api.apitemplate.api.model.dto.response.PlayerDto;
import com.template.api.apitemplate.api.model.mapper.todomain.PlayerMapperToDomain;
import com.template.api.apitemplate.api.model.mapper.todto.PlayerMapperToDto;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(config = MapperConfiguration.class) // Don't forget to add Getter & Setter to objects mapped
public abstract class PlayerMapper implements PlayerMapperToDomain, PlayerMapperToDto {
}
