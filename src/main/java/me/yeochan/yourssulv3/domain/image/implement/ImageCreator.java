package me.yeochan.yourssulv3.domain.image.implement;

import lombok.RequiredArgsConstructor;
import me.yeochan.yourssulv3.domain.image.ContentType;
import me.yeochan.yourssulv3.domain.image.persistence.ImageEntity;
import me.yeochan.yourssulv3.infrastructure.stroage.ObjectStorage;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

@Component
@RequiredArgsConstructor
public class ImageCreator {
    public final ObjectStorage objectStorage;

    public boolean upload(MultipartFile file, ContentType contentType, Long contentId) {
        String url = objectStorage.upload(file);
        ImageEntity image = new ImageEntity(url, contentType, contentId);
        return;
    }
}
