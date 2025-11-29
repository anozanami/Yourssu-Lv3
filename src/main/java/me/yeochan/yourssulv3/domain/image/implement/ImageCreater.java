package me.yeochan.yourssulv3.domain.image.implement;

import lombok.RequiredArgsConstructor;
import me.yeochan.yourssulv3.infrastructure.stroage.ObjectStorage;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

@Component
@RequiredArgsConstructor
public class ImageCreater {
    public final ObjectStorage objectStorage;

    public String upload(MultipartFile file) {
        String url = objectStorage.upload(file);


        return;
    }
}
