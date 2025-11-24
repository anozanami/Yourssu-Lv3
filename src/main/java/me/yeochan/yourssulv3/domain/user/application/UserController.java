package me.yeochan.yourssulv3.domain.user.application;

import jakarta.validation.Valid;
import me.yeochan.yourssulv3.domain.user.application.dto.UserRegisterRequest;
import me.yeochan.yourssulv3.domain.user.business.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/user")
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/register")
    public ResponseEntity<Long> registerUser(
            @Valid @RequestBody UserRegisterRequest userRegisterRequest
    ) {
        Long createdId = userService.register(userRegisterRequest);

        return ResponseEntity.status(HttpStatus.CREATED).body(createdId);

    }
}
