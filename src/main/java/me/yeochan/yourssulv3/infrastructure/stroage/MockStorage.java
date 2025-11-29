package me.yeochan.yourssulv3.infrastructure.stroage;

import org.springframework.web.multipart.MultipartFile;

public class MockStorage implements ObjectStorage {
    @Override
    public String upload(MultipartFile file) {
        return "example.com/image.png";
    }
}
