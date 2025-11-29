package me.yeochan.yourssulv3.domain.product.sub.image.persistence;

import me.yeochan.yourssulv3.domain.image.persistence.ImageEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ImageRepository extends JpaRepository<ImageEntity, Long> {
}
