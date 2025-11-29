package me.yeochan.yourssulv3.domain.product.sub.image.persistence;

import jakarta.persistence.*;
import lombok.NoArgsConstructor;
import me.yeochan.yourssulv3.domain.product.persistence.ProductEntity;
import org.springframework.data.annotation.CreatedDate;

import java.time.LocalDateTime;

@Entity
@Table(name = "product_image")
@NoArgsConstructor
public class ImageEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String url;


    // TODO: 스토리지에 업로드 된걸 기준으로?
    @CreatedDate
    private LocalDateTime createdAt;

    @JoinColumn(name = "product_id")
    @ManyToOne(fetch = FetchType.LAZY)
    private ProductEntity product;

    public ImageEntity(String url, ProductEntity product) {
        this.url = url;
        this.product = product;
    }
}
