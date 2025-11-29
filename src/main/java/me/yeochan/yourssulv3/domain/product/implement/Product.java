package me.yeochan.yourssulv3.domain.product.implement;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
@AllArgsConstructor
public class Product {
    private Long id;
    private String title;
    private String introduction;
    private String description;
    private int bookMarkCount;
    private LocalDateTime createdAt;
}
