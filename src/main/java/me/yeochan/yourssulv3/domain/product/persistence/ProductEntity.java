package me.yeochan.yourssulv3.domain.product.persistence;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import me.yeochan.yourssulv3.domain.product.implement.Product;

import java.time.LocalDateTime;

@Entity
@Table(name = "product")
@Getter
@AllArgsConstructor
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
    private int bookMarkCount;

    @Column(nullable = false)
    private LocalDateTime createdAt;

    public ProductEntity(String title, String introduction, String description) {
        this.title = title;
        this.introduction = introduction;
        this.description = description;
    }

    public ProductEntity() {
    }

    public static ProductEntity of(Product product) {
        return new ProductEntity(
                product.getId(),
                product.getTitle(),
                product.getIntroduction(),
                product.getDescription(),
                product.getBookMarkCount(),
                product.getCreatedAt()
        );
    }

    public static Product toDomain(ProductEntity entity) {
        return new Product(
                entity.id,
                entity.title,
                entity.introduction,
                entity.description,
                entity.bookMarkCount,
                entity.createdAt
        );
    }
}
