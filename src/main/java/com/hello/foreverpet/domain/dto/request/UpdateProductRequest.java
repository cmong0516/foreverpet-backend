package com.hello.foreverpet.domain.dto.request;

import com.hello.foreverpet.domain.dto.Categories;
import lombok.Data;

@Data
public class UpdateProductRequest {
    private String productName;
    private String productDescription;
    private Categories categories;
    private Long productPrice;
    private String productImage;
}
