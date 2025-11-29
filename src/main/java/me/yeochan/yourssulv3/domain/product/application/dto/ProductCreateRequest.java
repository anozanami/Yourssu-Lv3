package me.yeochan.yourssulv3.domain.product.application.dto;

import me.yeochan.yourssulv3.domain.product.business.dto.ProductCreateCommand;

public record ProductCreateRequest(
        String title,
        String introduction,
        String description
) {
    public ProductCreateCommand toCommand() {
        return new ProductCreateCommand(
                title,
                introduction,
                description
        );
    }
}
