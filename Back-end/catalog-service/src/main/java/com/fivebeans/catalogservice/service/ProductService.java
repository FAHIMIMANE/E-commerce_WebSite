package com.fivebeans.catalogservice.service;

import com.fivebeans.catalogservice.entity.Product;
import com.fivebeans.catalogservice.dto.CreateProductRequest;
import com.fivebeans.catalogservice.dto.ProductResponse;
import com.fivebeans.catalogservice.dto.UpdateProductRequest;
import javax.validation.Valid;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;


public interface ProductService {

  String createProduct(@Valid CreateProductRequest createProductRequest);

  ProductResponse getProduct(String productId);

  void deleteProduct(String productId);

  void updateProduct(UpdateProductRequest updateProductRequest);

  Page<Product> findAllProducts(Pageable pageable);

  Page<ProductResponse> getAllProducts(String sort, Integer page, Integer size);
}
