package me.yeochan.yourssulv3.domain.image;

import jakarta.persistence.*;

@Entity
@Table(name = "image_mapper")
public class ImageMapper {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


}
