package tt.auth.service;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import tt.auth.dto.UserDto;
import tt.auth.model.User;
import tt.auth.repository.UserRepository;

import java.util.List;

@Slf4j
@AllArgsConstructor
@Service
public class UserService {

    private UserRepository userRepository;

    public void createUser(UserDto userDto) {
        // Валидация и сохранение пользователя в базу данных
    }

    public void deleteUser(Long userId) {
        User user = userRepository.findById(userId).orElseThrow(() -> new RuntimeException("User no found."));
        userRepository.delete(user);

        log.info("User deleted with id {}", userId);
    }

    public List<User> findAllUsers() {
        return userRepository.findAll();
    }


}
