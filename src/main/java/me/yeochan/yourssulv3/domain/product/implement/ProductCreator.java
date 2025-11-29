package me.yeochan.yourssulv3.domain.product.implement;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import me.yeochan.yourssulv3.domain.product.persistence.ProductEntity;
import me.yeochan.yourssulv3.domain.product.persistence.ProductRepository;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
@Transactional
public class ProductCreator {

    private final ProductRepository productRepository;

    public Product create(String title, String introduction, String description) {

        ProductEntity productEntity = new ProductEntity(
                title, introduction, description
        );

        return ProductEntity.toDomain(this.productRepository.save(productEntity));
    }
}
