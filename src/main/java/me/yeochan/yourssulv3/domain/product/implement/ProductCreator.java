package me.yeochan.yourssulv3.domain.product.implement;

import lombok.RequiredArgsConstructor;
import me.yeochan.yourssulv3.domain.image.ContentType;
import me.yeochan.yourssulv3.domain.image.implement.ImageCreator;
import me.yeochan.yourssulv3.domain.product.persistence.ProductEntity;
import me.yeochan.yourssulv3.domain.product.persistence.ProductRepository;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@Component
@RequiredArgsConstructor
public class ProductCreator {

    private final ProductRepository productRepository;
    private final ImageCreator imageCreator;

    public Product create(String title, String introduction, String description, List<MultipartFile> images) {

        ProductEntity productEntity = new ProductEntity(
                title, introduction, description
        );

        images.stream()
                .forEach(image -> imageCreator.upload(image, ContentType.PRODUCT, productEntity.getId()));

        return ProductEntity.toDomain(this.productRepository.save(productEntity));
    }
}
