package com.project.mapper;

import com.project.model.User;
import com.project.model.UserDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * @author fajaryudi
 * @created 2023/04/11 - 10.47
 */
@Mapper
public interface UserMapper {
    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);
    UserDto userToUserDto(User user);
    User userDtoToUser(UserDto userDto);

    Iterable<UserDto> getUserDtos(Iterable<User> user);
}
