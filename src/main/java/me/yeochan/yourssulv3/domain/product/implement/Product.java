package me.yeochan.yourssulv3.domain.product.implement;

import lombok.AllArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@AllArgsConstructor
public class Product {
    private Long id;
    private String title;
    private String introduction;
    private String description;
    private List<String> imageUrls;
    private int bookMark;
    private LocalDateTime createdAt;
}
