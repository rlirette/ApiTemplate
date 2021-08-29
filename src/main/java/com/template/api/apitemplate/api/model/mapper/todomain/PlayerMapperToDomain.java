package com.template.api.apitemplate.api.model.mapper.todomain;

import com.template.api.apitemplate.api.model.dao.PlayerDao;
import com.template.api.apitemplate.api.model.domain.Player;
import com.template.api.apitemplate.api.model.dto.request.PlayerRequest;
import com.template.api.apitemplate.api.model.mapper.MapperConfiguration;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(config = MapperConfiguration.class)
public interface PlayerMapperToDomain {

    List<Player> mapToDomain(List<PlayerDao> source);

    Player mapToDomain(PlayerDao source);

    Player mapToDomain(PlayerRequest source);
}
