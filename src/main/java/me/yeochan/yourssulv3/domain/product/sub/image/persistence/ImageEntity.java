package me.yeochan.yourssulv3.domain.product.sub.image.persistence;

import jakarta.persistence.*;
import me.yeochan.yourssulv3.domain.product.persistence.ProductEntity;
import me.yeochan.yourssulv3.domain.product.sub.image.implement.Image;

import java.time.LocalDateTime;

@Entity
@Table(name = "product_image")
public class ImageEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String url;

    private LocalDateTime createdAt;

    @JoinColumn(name = "product_id")
    @ManyToOne(fetch = FetchType.LAZY)
    private ProductEntity product;

    public static ImageEntity of(Image image) {
        return new ImageEntity(
                image.
        )
    }
}
