package com.example.demo.user;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface UserMapper {
    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

    //@Mapping(source = "wrongField", target = "name")  // wrongField 없음!
    UserDto toDto(User user);
    User toEntity(UserDto dto);
}
