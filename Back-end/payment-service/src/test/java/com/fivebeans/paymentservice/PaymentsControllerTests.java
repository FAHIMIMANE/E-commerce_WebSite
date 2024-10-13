package com.fivebeans.paymentservice;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fivebeans.paymentservice.dto.CreatePaymentRequest;
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

class PaymentsControllerTests {
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
    public void testDoPayment_Unauthorized() throws Exception {
        CreatePaymentRequest request = new CreatePaymentRequest();
        request.setAmount(100);
        request.setCurrency("USD");
        request.setPaymentMethodId("paymentMethodId");

        mockMvc.perform(MockMvcRequestBuilders.post("/pay")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(objectMapper.writeValueAsString(request)))
                .andExpect(MockMvcResultMatchers.status().isUnauthorized());
    }

     */
}


