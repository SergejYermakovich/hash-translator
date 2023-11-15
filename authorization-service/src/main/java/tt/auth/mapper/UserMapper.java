package tt.auth.mapper;

import org.mapstruct.Mapper;
import tt.auth.dto.UserDto;
import tt.auth.model.User;

import java.util.List;

@Mapper
public interface UserMapper {

    User map(UserDto userDto);

    List<UserDto> mapAllUsersToDto(List<User> users);
}
