package me.yeochan.yourssulv3.domain.product.sub.image.persistence;

import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

@Component
public interface ImageStorage {
    String upload(MultipartFile file);
}
