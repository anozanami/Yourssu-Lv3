package me.yeochan.yourssulv3.domain.productImage.persistence;

import jakarta.persistence.*;
import me.yeochan.yourssulv3.domain.product.persistence.ProductEntity;

import java.time.LocalDateTime;

@Entity
@Table(name = "product_image")
public class ProductImage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String url;

    private LocalDateTime createdAt;

    @JoinColumn(name = "product_id")
    @ManyToOne(fetch = FetchType.LAZY)
    private ProductEntity product;
}
