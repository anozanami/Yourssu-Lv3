package me.yeochan.yourssulv3.domain.product.business;

import lombok.RequiredArgsConstructor;
import me.yeochan.yourssulv3.domain.product.implement.Product;
import me.yeochan.yourssulv3.domain.product.implement.ProductCreator;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProductService {
    private final ProductCreator productCreator;

    public Long createProduct(
            String title,
            String description,
            String introduction
    ) {
        Product product = this.productCreator.create(title, description, introduction);

        return product.getId();
    }
}
