package me.yeochan.yourssulv3.domain.image;

import jakarta.persistence.*;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;

import java.time.LocalDateTime;

@Entity
@Table(name = "image")
@NoArgsConstructor
public class ImageEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String url;

    // TODO: 스토리지에 업로드 된걸 기준으로?
    @CreatedDate
    private LocalDateTime createdAt;

    public ImageEntity(String url) {
        this.url = url;
    }
}
