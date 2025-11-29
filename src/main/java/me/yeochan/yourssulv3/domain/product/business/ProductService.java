package me.yeochan.yourssulv3.domain.product.business;

import lombok.RequiredArgsConstructor;
import me.yeochan.yourssulv3.domain.image.ContentType;
import me.yeochan.yourssulv3.domain.image.implement.ImageCreator;
import me.yeochan.yourssulv3.domain.product.business.dto.ProductCreateCommand;
import me.yeochan.yourssulv3.domain.product.business.dto.ProductFindResult;
import me.yeochan.yourssulv3.domain.product.implement.Product;
import me.yeochan.yourssulv3.domain.product.implement.ProductCreator;
import me.yeochan.yourssulv3.domain.product.implement.ProductFinder;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductService {
    private final ProductCreator productCreator;
    private final ImageCreator imageCreator;
    private final ProductFinder productFinder;

    public Long createProduct(
            ProductCreateCommand command,
            List<MultipartFile> images
    ) {
        Product product = this.productCreator.create(
                command.title(),
                command.description(),
                command.introduction());

        images.forEach(image -> this.imageCreator.upload(image, ContentType.PRODUCT, product.getId()));

        return product.getId();
    }

    public List<ProductFindResult> findAll(PageRequest pageRequest) {
        return productFinder.findAll(pageRequest).stream().map(ProductFindResult::from).toList();
    }
}
