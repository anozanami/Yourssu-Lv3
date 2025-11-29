package me.yeochan.yourssulv3.domain.product.application;

import lombok.RequiredArgsConstructor;
import me.yeochan.yourssulv3.domain.product.application.dto.ProductCreateRequest;
import me.yeochan.yourssulv3.domain.product.application.dto.ProductFindAllResponse;
import me.yeochan.yourssulv3.domain.product.business.ProductService;
import me.yeochan.yourssulv3.domain.product.business.dto.ProductCreateCommand;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
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

    @GetMapping("/all/{page}")
    public ResponseEntity<List<ProductFindAllResponse>> findAll(
            @PathVariable Integer page
    ) {
        PageRequest pageRequest = PageRequest.of(page, 30, Sort.by("createdAt").descending());
        List<ProductFindAllResponse> responses = productService.findAll(pageRequest).stream().map(ProductFindAllResponse::from).toList();
        return ResponseEntity.ok(responses);
    }
}
