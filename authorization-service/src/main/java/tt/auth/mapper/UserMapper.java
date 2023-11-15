package tt.auth.mapper;

import org.mapstruct.Mapper;
import tt.auth.dto.UserDto;
import tt.auth.model.User;

@Mapper
public interface UserMapper {

    User map(UserDto userDto);
}
