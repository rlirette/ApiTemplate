package com.template.api.apitemplate.api.model.mapper.todao;

import com.template.api.apitemplate.api.model.dao.PlayerDao;
import com.template.api.apitemplate.api.model.domain.Player;
import com.template.api.apitemplate.api.model.mapper.MapperConfiguration;
import org.mapstruct.Mapper;

@Mapper(config = MapperConfiguration.class)
public interface PlayerMapperToDao {

    PlayerDao mapToDao(Player source);
}
