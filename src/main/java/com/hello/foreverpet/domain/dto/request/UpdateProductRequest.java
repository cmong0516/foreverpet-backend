package com.hello.foreverpet.domain.dto.request;

import com.hello.foreverpet.domain.dto.Categories;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
@Schema(description = "상품 수정 DTO")
public class UpdateProductRequest {
    private String productName;
    private String productDescription;
    // String 으로 받아서 Categories name 과 비교후 작업 필요
    private Categories categories;
    private Long productPrice;
    private String productImage;
}
