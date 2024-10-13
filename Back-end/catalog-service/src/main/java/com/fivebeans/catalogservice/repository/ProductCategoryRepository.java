package com.fivebeans.catalogservice.repository;

import com.fivebeans.catalogservice.entity.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ProductCategoryRepository extends JpaRepository<ProductCategory, String> {
}
