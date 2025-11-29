package me.yeochan.yourssulv3.domain.product.business;

import lombok.RequiredArgsConstructor;
import me.yeochan.yourssulv3.domain.image.implement.ImageCreator;
import me.yeochan.yourssulv3.domain.product.business.dto.ProductCreateCommand;
import me.yeochan.yourssulv3.domain.product.implement.Product;
import me.yeochan.yourssulv3.domain.product.implement.ProductCreator;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductService {
    private final ProductCreator productCreator;
    private final ImageCreator imageCreator;

    public Long createProduct(
            ProductCreateCommand command,
            List<MultipartFile> images
    ) {
        Product product = this.productCreator.create(
                command.title(),
                command.description(),
                command.introduction());


        return product.getId();
    }
}
