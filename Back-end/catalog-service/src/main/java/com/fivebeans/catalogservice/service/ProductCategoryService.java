package com.fivebeans.catalogservice.service;

import com.fivebeans.catalogservice.entity.ProductCategory;
import com.fivebeans.catalogservice.dto.CreateProductCategoryRequest;
import com.fivebeans.catalogservice.dto.UpdateProductCategoryRequest;
import javax.validation.Valid;

import org.springframework.data.domain.Page;


public interface ProductCategoryService {

  String createProductCategory(@Valid CreateProductCategoryRequest createProductCategoryRequest);

  ProductCategory getProductCategory(String productCategoryId);

  void deleteProductCategory(String productCategoryId);

  void updateProductCategory(UpdateProductCategoryRequest updateProductCategoryRequest);

  Page<ProductCategory> getAllProductCategories(String sort, Integer page, Integer size);
}
