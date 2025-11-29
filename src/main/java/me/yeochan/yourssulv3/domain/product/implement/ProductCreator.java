package me.yeochan.yourssulv3.domain.product.implement;

import me.yeochan.yourssulv3.domain.product.persistence.ProductEntity;
import me.yeochan.yourssulv3.domain.product.persistence.ProductRepository;
import org.springframework.stereotype.Component;

@Component
public class ProductCreator {

    private final ProductRepository productRepository;

    public ProductCreator(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public Product create(String title, String introduction, String description) {
        ProductEntity productEntity = new ProductEntity(
                title, introduction, description
        );
        return ProductEntity.toDomain(this.productRepository.save(productEntity));
    }
}
