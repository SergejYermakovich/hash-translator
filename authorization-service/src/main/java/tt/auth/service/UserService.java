package tt.auth.service;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import tt.auth.dto.UserDto;
import tt.auth.repository.UserRepository;

@Slf4j
@AllArgsConstructor
@Service
public class UserService {

    private UserRepository userRepository;

    public void createUser(UserDto userDto) {
        // Валидация и сохранение пользователя в базу данных
    }

    public void deleteUser(Long userId) {
        // Удаление пользователя из базы данных
    }

}
