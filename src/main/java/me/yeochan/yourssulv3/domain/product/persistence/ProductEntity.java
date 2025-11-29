package me.yeochan.yourssulv3.domain.product.persistence;

import java.time.LocalDateTime;
import java.util.List;
import jakarta.persistence.*;
import me.yeochan.yourssulv3.domain.product.implement.Product;

@Entity
@Table(name = "product")
public class ProductEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private String introduction;

    @Column(nullable = false)
    private String description;

    @Column(nullable = false)
    private List<String> imageUrls;

    @Column(nullable = false)
    private int bookMark;

    @Column(nullable = false)
    private LocalDateTime createdAt;

    public static Product toDomain(ProductEntity entity) {
        return new Product(
                entity.id,
                entity.title,
                entity.introduction,
                entity.description,
                entity.imageUrls,
                entity.bookMark,
                entity.createdAt
        );
    }
}
