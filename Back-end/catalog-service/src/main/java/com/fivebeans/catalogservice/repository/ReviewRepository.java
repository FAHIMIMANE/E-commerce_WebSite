package com.fivebeans.catalogservice.repository;

import com.fivebeans.catalogservice.entity.Review;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;


@Repository
public interface ReviewRepository extends JpaRepository<Review, String> {

    Optional<Review> findByUserIdAndProductId(String userId, String productId);

    Optional<List<Review>> findAllByProductId(String productId);

    long countAllByProductId(String productId);
}
