package me.yeochan.yourssulv3.domain.product.application.dto;

import me.yeochan.yourssulv3.domain.product.business.dto.ProductFindResult;

public record ProductFindAllResponse(
        Long id,
        String title,
        String introduction,
        String description,
        Integer bookMarkCount
) {
    public static ProductFindAllResponse from(ProductFindResult product) {
        return new ProductFindAllResponse(
                product.id(),
                product.title(),
                product.introduction(),
                product.description(),
                product.bookMarkCount()
        );
    }
}
