package com.fivebeans.catalogservice;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fivebeans.catalogservice.dto.CreateProductRequest;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.DynamicPropertyRegistry;
import org.springframework.test.context.DynamicPropertySource;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.testcontainers.containers.MySQLContainer;
import org.testcontainers.junit.jupiter.Container;
import org.testcontainers.junit.jupiter.Testcontainers;

@SpringBootTest
@Testcontainers
@AutoConfigureMockMvc
@TestPropertySource(properties = {
        "spring.security.oauth2.resourceserver.jwt.jwk-set-uri=http://localhost/oauth/token_key"
})

class ProductControllerTests {
    /*
    @Autowired
    private MockMvc mockMvc;
    @Autowired
    private ObjectMapper objectMapper;

    @Container
    static MySQLContainer<?> mySQLContainer = new MySQLContainer<>("mysql:latest")
            .withDatabaseName("fivebeans_db")
            .withUsername("root")
            .withPassword("");

    @DynamicPropertySource
    static void setProperties(DynamicPropertyRegistry registry) {
        registry.add("spring.datasource.url", mySQLContainer::getJdbcUrl);
        registry.add("spring.datasource.username", mySQLContainer::getUsername);
        registry.add("spring.datasource.password", mySQLContainer::getPassword);
    }

    @BeforeAll
    static void setUp() {
        mySQLContainer.start();
    }

    @Test
    void testCreateProduct_Unauthorized() throws Exception {
        CreateProductRequest request = new CreateProductRequest();
        request.setProductName("Test Product");
        request.setDescription("Test Description");
        request.setPrice(10.0);
        request.setProductCategoryId("category_id");
        request.setAvailableItemCount(100);

        mockMvc.perform(MockMvcRequestBuilders.post("/product")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(objectMapper.writeValueAsString(request)))
                .andExpect(MockMvcResultMatchers.status().isUnauthorized());
    }

    @Test
    void testDeleteProduct_Unauthorized() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.delete("/product/{productId}", "product_id"))
                .andExpect(MockMvcResultMatchers.status().isUnauthorized());
    }

    @Test
    void testUpdateProduct_Unauthorized() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.put("/product")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content("{}")) // Assuming an empty update request for simplicity
                .andExpect(MockMvcResultMatchers.status().isUnauthorized());
    }

    @Test
    void testGetAllProducts() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/products"))
                .andExpect(MockMvcResultMatchers.status().isOk());
    }

     */
}