package com.template.api.apitemplate.api.model.mapper.todto;

import com.template.api.apitemplate.api.model.domain.Player;
import com.template.api.apitemplate.api.model.dto.PlayerDto;
import com.template.api.apitemplate.api.model.dto.response.PlayerResponse;
import com.template.api.apitemplate.api.model.mapper.MapperConfiguration;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(config = MapperConfiguration.class)
public interface PlayerMapperToDto {

    List<PlayerResponse> mapToDto(List<Player> source);

    PlayerResponse mapToDto(Player source);
}
