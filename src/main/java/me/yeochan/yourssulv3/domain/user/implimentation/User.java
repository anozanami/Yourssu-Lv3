package me.yeochan.yourssulv3.domain.user.implimentation;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public class User {
    private Long id = null;
    private String name;
    private String email;
    private String password;
}
