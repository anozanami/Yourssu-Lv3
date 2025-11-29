package me.yeochan.yourssulv3.domain.product.implement;

import lombok.RequiredArgsConstructor;
import me.yeochan.yourssulv3.domain.product.persistence.ProductEntity;
import me.yeochan.yourssulv3.domain.product.persistence.ProductRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;

import java.util.List;

@RequiredArgsConstructor
@Component
public class ProductFinder {
    private final ProductRepository productRepository;

    public List<Product> findAll(Pageable pageable) {
        Page<ProductEntity> all = productRepository.findAll(pageable);
        return all.stream().map(ProductEntity::toDomain).toList();
    }
}
