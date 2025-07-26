package com.finance.user.mapper;

import com.finance.user.dto.UserRequest;
import com.finance.user.dto.UserResponse;
import com.finance.user.model.User;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring") //this will tell MapperStruct to make the mapperImpl a Spring Bean
public interface UserMapper {
    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

    User toEntity(UserRequest request);
    UserResponse toResponse(User user);
}
