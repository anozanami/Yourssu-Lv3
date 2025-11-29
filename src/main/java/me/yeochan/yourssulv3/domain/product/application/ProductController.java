package me.yeochan.yourssulv3.domain.product.application;

import lombok.RequiredArgsConstructor;
import me.yeochan.yourssulv3.domain.product.application.dto.ProductCreateRequest;
import me.yeochan.yourssulv3.domain.product.business.ProductService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.URI;

@RestController
@RequestMapping("/api/v1/product")
@RequiredArgsConstructor
public class ProductController {
    private final ProductService productService;

    @PostMapping
    public ResponseEntity<Long> createProduct(
            @RequestBody ProductCreateRequest productCreateRequest
    ) {
        Long id = productService.createProduct(
                productCreateRequest.title(),
                productCreateRequest.description(),
                productCreateRequest.introduction()
        );

        return ResponseEntity.created(URI.create("/api/v1/product")).body(id);
    }

    @PostMapping("/image")
    public ResponseEntity<?> uploadImage() {
        return ResponseEntity.ok().build();
    }
}
