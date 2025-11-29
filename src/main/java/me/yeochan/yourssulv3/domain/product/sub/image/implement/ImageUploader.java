package me.yeochan.yourssulv3.domain.product.sub.image.implement;

import lombok.RequiredArgsConstructor;
import me.yeochan.yourssulv3.domain.product.sub.image.persistence.ImageRepository;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class ImageUploader {
    private final ImageRepository imageRepository;

    public void upload(Image image) {


        imageRepository.save()
    }
}
