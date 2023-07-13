package com.hello.foreverpet.domain.dto.response;

import com.hello.foreverpet.domain.dto.Categories;
import com.hello.foreverpet.domain.entity.Product;
import lombok.Data;

@Data
public class ProductResponse {
    private Long id;
    private String productName;
    private String productDescription;
    private Categories categories;
    private Long productPrice;
    private Long numberOfSold;

    public ProductResponse(Product product) {
        this.id = product.getProductId();
        this.productName = product.getProductName();
        this.productDescription = product.getProductDescription();
        this.categories = product.getCategories();
        this.productPrice = product.getProductPrice();
        this.numberOfSold = product.getNumberOfSold();
    }
}
