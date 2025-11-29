package me.yeochan.yourssulv3.domain.product.sub.image.implement;

import org.springframework.web.multipart.MultipartFile;

public interface S3Uploader {

    String upload(MultipartFile file);
}
