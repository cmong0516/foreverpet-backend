package com.hello.foreverpet.controller;

import com.hello.foreverpet.domain.dto.request.NewProductRequest;
import com.hello.foreverpet.domain.dto.request.UpdateProductRequest;
import com.hello.foreverpet.domain.dto.response.ProductResponse;
import com.hello.foreverpet.service.ProductService;
import io.swagger.annotations.ApiOperation;
import jakarta.validation.Valid;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class ProductController {

    private final ProductService productService;

    // 상품 등록
    @ApiOperation(value = "상품 등록")
    @PostMapping("/products")
    public ResponseEntity<Long> createProduct(@RequestBody @Valid NewProductRequest newProductRequest) {
        Long productId = productService.createProduct(newProductRequest);

        return ResponseEntity.ok(productId);
    }

    // 모든 상품 조회
    @ApiOperation(value = "모든 상품 id 순서로 조회")
    @GetMapping("/products")
    public ResponseEntity<List<ProductResponse>> allProducts() {
        return ResponseEntity.ok(productService.getAllProducts());
    }

    @ApiOperation(value = "id 로 특정 상품 조회")
    @GetMapping("/products/{id}")
    public ProductResponse findProductById(@PathVariable Long id) {
        return productService.findProductById(id);
    }

    @ApiOperation(value = "특정 상품 업데이트")
    @PutMapping("/products/{id}")
    public void updateProduct(@PathVariable Long id, @RequestBody UpdateProductRequest updateProductRequest) {
        productService.updateProduct(id,updateProductRequest);
    }

    @ApiOperation(value = "특정 상품 삭제")
    @DeleteMapping("/product/{id}")
    public void deleteProduct(@PathVariable Long id) {
        productService.deleteProduct(id);
    }

}
