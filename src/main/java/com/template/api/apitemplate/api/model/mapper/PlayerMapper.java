package com.template.api.apitemplate.api.model.mapper;

import com.template.api.apitemplate.api.model.mapper.todao.PlayerMapperToDao;
import com.template.api.apitemplate.api.model.mapper.todomain.PlayerMapperToDomain;
import com.template.api.apitemplate.api.model.mapper.todto.PlayerMapperToDto;
import org.mapstruct.Mapper;

@Mapper(config = MapperConfiguration.class) // Don't forget to add Getter & Setter to objects mapped
public abstract class PlayerMapper implements PlayerMapperToDomain, PlayerMapperToDto, PlayerMapperToDao {
}
