package me.yeochan.yourssulv3.domain.user.persistence;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import me.yeochan.yourssulv3.domain.user.implimentation.User;

@Entity
@Table(name = "users")
@AllArgsConstructor
@NoArgsConstructor
@Getter
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String email;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String password;

    public static User toDomain(UserEntity entity) {
        return new User(entity.getId(), entity.getEmail(), entity.getName(), entity.getPassword());
    }
}
