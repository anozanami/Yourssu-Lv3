package me.yeochan.yourssulv3.domain.product.application.dto;

public record ProductCreateRequest(
        String title,
        String introduction,
        String description
) {
}
