package me.yeochan.yourssulv3.domain.product.sub.image.implement;

import lombok.RequiredArgsConstructor;
import me.yeochan.yourssulv3.domain.image.ImageEntity;
import me.yeochan.yourssulv3.domain.product.implement.Product;
import me.yeochan.yourssulv3.domain.product.sub.image.persistence.ImageRepository;
import me.yeochan.yourssulv3.domain.product.sub.image.persistence.ImageStorage;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

@RequiredArgsConstructor
@Component
public class ImageUploader {
    private final ImageRepository imageRepository;
    private final ImageStorage imageStorage;

    public void upload(Product product, MultipartFile file) {
        String url = imageStorage.upload(file);
        imageRepository.save(new ImageEntity(url));
    }
}
