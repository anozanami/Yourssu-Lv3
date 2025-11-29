package me.yeochan.yourssulv3.domain.product.business;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProductService {

    public Long createProduct(
            String title,
            String description,
            String introduction
    ) {
        return 0L;
    }
}
