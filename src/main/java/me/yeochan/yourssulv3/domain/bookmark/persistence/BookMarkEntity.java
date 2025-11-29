package me.yeochan.yourssulv3.domain.bookmark.persistence;

import jakarta.persistence.*;
import me.yeochan.yourssulv3.domain.product.persistence.ProductEntity;
import me.yeochan.yourssulv3.domain.user.persistence.UserEntity;

@Entity
@Table(name = "bookmark")
public class BookMarkEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "product_id")
    private ProductEntity product;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private UserEntity user;
}
