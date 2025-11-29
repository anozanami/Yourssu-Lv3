package me.yeochan.yourssulv3.infrastructure.stroage;

import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

@Component
public interface ObjectStorage {
    String upload(MultipartFile file);
}
