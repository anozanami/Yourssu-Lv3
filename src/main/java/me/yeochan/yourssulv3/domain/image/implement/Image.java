package me.yeochan.yourssulv3.domain.image.implement;

import lombok.AllArgsConstructor;
import me.yeochan.yourssulv3.domain.image.ContentType;

import java.time.LocalDateTime;

@AllArgsConstructor
public class Image {
    private Long id;
    private String url;
    private LocalDateTime createdAt;
    private ContentType contentType;
    private Long contentId;
}
