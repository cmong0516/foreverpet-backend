package com.hello.foreverpet.domain.dto.request;

import com.hello.foreverpet.domain.dto.Categories;
import com.hello.foreverpet.domain.entity.Product;
import lombok.Data;

@Data
public class NewProductRequest {
    private String productName;
    private String productDescription;
    private String categories;
    private Long productPrice;
    private String productImage;

    public Product toEntity() {
        return Product.builder().productName(this.productName)
                .productDescription(this.productDescription)
                .categories(Categories.valueOf(this.categories))
                .productPrice(this.productPrice)
                .productImage(this.productImage)
                .build();
    }

    public NewProductRequest(String productName, String productDescription, String categories, Long productPrice,
                             String productImage) {
        this.productName = productName;
        this.productDescription = productDescription;
        this.categories = categories;
        this.productPrice = productPrice;
        this.productImage = productImage;
    }
}
