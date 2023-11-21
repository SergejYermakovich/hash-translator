package tt.auth.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
import tt.auth.dto.UserDto;
import tt.auth.model.User;

@Mapper(componentModel = "spring")
public interface UserMapper {

    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

    @Mapping(target = "email", source = "email")
    @Mapping(target = "password", source = "password")
    User mapToEntity(UserDto userDto);

    UserDto mapToDto(User user);

}
