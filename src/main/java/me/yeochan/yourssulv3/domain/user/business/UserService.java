package me.yeochan.yourssulv3.domain.user.business;

import me.yeochan.yourssulv3.domain.user.application.dto.UserRegisterRequest;
import me.yeochan.yourssulv3.domain.user.implimentation.User;
import me.yeochan.yourssulv3.domain.user.implimentation.UserCreateHelper;

import org.springframework.stereotype.Service;

@Service
public class UserService {
    private UserCreateHelper userCreateHelper;

    public UserService(UserCreateHelper userCreateHelper) {
        this.userCreateHelper = userCreateHelper;
    }

    public Long register(UserRegisterRequest userRegisterRequest) {
        User user = userCreateHelper.createUser(
                userRegisterRequest.email(),
                userRegisterRequest.name(),
                userRegisterRequest.password());
        return user.getId();
    }
}
