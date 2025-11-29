package me.yeochan.yourssulv3.domain.image.implement;

import lombok.RequiredArgsConstructor;
import me.yeochan.yourssulv3.domain.image.ContentType;
import me.yeochan.yourssulv3.domain.image.persistence.ImageEntity;
import me.yeochan.yourssulv3.domain.image.persistence.ImageRepository;
import me.yeochan.yourssulv3.infrastructure.stroage.ObjectStorage;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

@Component
@RequiredArgsConstructor
public class ImageCreator {
    private final ObjectStorage objectStorage;
    private final ImageRepository imageRepository;

    @Transactional
    public Image upload(MultipartFile file, ContentType contentType, Long contentId) {
        String url = this.objectStorage.upload(file);
        ImageEntity image = new ImageEntity(url, contentType, contentId);
        ImageEntity saved = this.imageRepository.save(image);

        return ImageEntity.toDomain(saved);
    }
}
