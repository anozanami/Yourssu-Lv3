package me.yeochan.yourssulv3.domain.user.application.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;

public record UserRegisterRequest(
        @NotNull
        @Email
        String email,

        @NotNull
        String name,

        @NotNull
        String password
) {
}
