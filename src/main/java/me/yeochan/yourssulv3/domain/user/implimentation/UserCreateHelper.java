package me.yeochan.yourssulv3.domain.user.implimentation;

import me.yeochan.yourssulv3.domain.user.persistence.UserEntity;
import me.yeochan.yourssulv3.domain.user.persistence.UserRepository;
import org.springframework.stereotype.Component;

@Component
public class UserCreateHelper {
    private UserRepository userRepository;

    public UserCreateHelper(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User createUser(String email, String name, String password) {
        UserEntity newUser = new UserEntity(
                null,
                email,
                name,
                password
        );

        UserEntity entity = userRepository.save(newUser);
        User savedUser = UserEntity.toDomain(entity);

        return savedUser;
    }
}
