package com.fivebeans.catalogservice.service;

import com.fivebeans.catalogservice.entity.Review;
import com.fivebeans.catalogservice.dto.CreateOrUpdateReviewRequest;

import java.util.List;


public interface ReviewService {

    void createOrUpdateReview(CreateOrUpdateReviewRequest createOrUpdateReviewRequest);

    List<Review> getReviewsForProduct(String productId);

}
