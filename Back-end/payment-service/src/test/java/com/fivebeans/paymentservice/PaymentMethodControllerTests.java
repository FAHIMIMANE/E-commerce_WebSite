package com.fivebeans.paymentservice;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fivebeans.paymentservice.dto.Card;
import org.junit.jupiter.api.BeforeAll;
import com.fivebeans.paymentservice.dto.CreatePaymentMethodRequest;
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

class PaymentMethodControllerTests {

    /*@Autowired
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
    public void testCreatePaymentMethod_Unauthorized() throws Exception {

        Card card = new Card();
        card.setCardNumber("4242424242424242");
        card.setExpirationMonth(12);
        card.setExpirationYear(2024);
        card.setCvv(123);

        CreatePaymentMethodRequest request = new CreatePaymentMethodRequest();
        request.setCard(card);

        mockMvc.perform(MockMvcRequestBuilders.post("/paymentMethod")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(objectMapper.writeValueAsString(request)))
                .andExpect(MockMvcResultMatchers.status().isUnauthorized());
    }



    @Test
    public void testFindAllPaymentMethods() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/api/paymentMethod/"))
                .andExpect(MockMvcResultMatchers.status().isUnauthorized());
    }

    @Test
    public void testFindPaymentMethodById() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/paymentMethod/{paymentMethodId}", "paymentMethodId"))
                .andExpect(MockMvcResultMatchers.status().isUnauthorized());
    }

    @Test
    public void testUpdatePaymentMethod() throws Exception {
        Card card = new Card();
        card.setCardNumber("4242424242424242");
        card.setExpirationMonth(12);
        card.setExpirationYear(2024);
        card.setCvv(123);

        CreatePaymentMethodRequest request = new CreatePaymentMethodRequest();
        request.setCard(card);

        mockMvc.perform(MockMvcRequestBuilders.put("/paymentMethod/{paymentMethodId}", "paymentMethodId")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(objectMapper.writeValueAsString(request)))
                .andExpect(MockMvcResultMatchers.status().isUnauthorized());
    }

    @Test
    public void testDeletePaymentMethod() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.delete("/paymentMethod/{paymentMethodId}", "paymentMethodId"))
                .andExpect(MockMvcResultMatchers.status().isUnauthorized());
    }*/
}




