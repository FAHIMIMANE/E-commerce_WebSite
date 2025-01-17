package com.fivebeans.catalogservice.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpdateProductCategoryRequest {

    @NotNull(message = "productCategoryId should not be null!")
    @NotEmpty(message = "productCategoryId should not be empty!")
    private String productCategoryId;

    @NotNull(message = "productCategoryName should not be null!")
    @NotEmpty(message = "productCategoryName should not be empty!")
    private String productCategoryName;
    private String description;

}
