package me.yeochan.yourssulv3.domain.image.persistence;

import jakarta.persistence.*;
import lombok.NoArgsConstructor;
import me.yeochan.yourssulv3.domain.image.ContentType;
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

    @Enumerated(EnumType.STRING)
    private ContentType contentType;

    @Column(nullable = false)
    private Long contentId;

    public ImageEntity(String url) {
        this.url = url;
    }
}
