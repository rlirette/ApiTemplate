package com.template.api.apitemplate.api.model.mapper.todto;

import com.template.api.apitemplate.api.model.dao.PlayerDao;
import com.template.api.apitemplate.api.model.domain.Player;
import com.template.api.apitemplate.api.model.dto.response.PlayerDto;
import com.template.api.apitemplate.api.model.mapper.MapperConfiguration;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(config = MapperConfiguration.class)
public interface PlayerMapperToDto {

    List<PlayerDto> mapToDto(List<Player> source);

    PlayerDto mapToDto(Player source);
}
