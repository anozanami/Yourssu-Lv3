package me.yeochan.yourssulv3.domain.product.business.dto;

public record ProductCreateCommand(
        String title,
        String introduction,
        String description
) {
}
