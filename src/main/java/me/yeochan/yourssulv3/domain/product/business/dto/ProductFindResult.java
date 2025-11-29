package me.yeochan.yourssulv3.domain.product.business.dto;

import me.yeochan.yourssulv3.domain.product.implement.Product;

public record ProductFindResult(
        Long id,
        String title,
        String introduction,
        String description,
        Integer bookMarkCount
) {

    public static ProductFindResult from(Product product) {
        return new ProductFindResult(
                product.getId(),
                product.getTitle(),
                product.getIntroduction(),
                product.getDescription(),
                product.getBookMarkCount()
        );
    }
}
