package me.yeochan.yourssulv3.domain.product.application;

import lombok.RequiredArgsConstructor;
import me.yeochan.yourssulv3.domain.product.application.dto.ProductCreateRequest;
import me.yeochan.yourssulv3.domain.product.business.ProductService;
import me.yeochan.yourssulv3.domain.product.business.dto.ProductCreateCommand;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/api/v1/product")
@RequiredArgsConstructor
public class ProductController {
    private final ProductService productService;

    @PostMapping
    public ResponseEntity<Long> createProduct(
            @RequestPart("request") ProductCreateRequest productCreateRequest,
            @RequestPart("image") List<MultipartFile> images
    ) {
        ProductCreateCommand command = productCreateRequest.toCommand();
        Long id = productService.createProduct(
                command,
                images
        );

        return ResponseEntity.created(URI.create("/api/v1/product")).body(id);
    }
}
