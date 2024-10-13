package com.fivebeans.billingservice;


import com.fasterxml.jackson.databind.ObjectMapper;
import com.fivebeans.billingservice.dto.CreateAddressRequest;
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

class AddressControllerTests {

   /* @Autowired
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
    void testCreateAddress_Unauthorized() throws Exception {
        CreateAddressRequest request = new CreateAddressRequest();
        request.setAddressLine1("123 Main St");
        request.setCity("Springfield");
        request.setState("IL");
        request.setPostalCode("12345");
        request.setCountry("US");
        request.setPhone("123-456-7890");

        mockMvc.perform(MockMvcRequestBuilders.post("/address")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(objectMapper.writeValueAsString(request)))
                .andExpect(MockMvcResultMatchers.status().isUnauthorized());
    }

    @Test
    void testGetAllAddresses_Unauthorized() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/address"))
                .andExpect(MockMvcResultMatchers.status().isUnauthorized());
    }

    @Test
    void testGetAddressById_Unauthorized() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/address/{addressId}", "address_id"))
                .andExpect(MockMvcResultMatchers.status().isUnauthorized());
    }

    @Test
    void testUpdateAddress_Unauthorized() throws Exception {
        CreateAddressRequest request = new CreateAddressRequest();
        request.setAddressLine1("456 Elm St");
        request.setCity("Springfield");
        request.setState("IL");
        request.setPostalCode("54321");
        request.setCountry("US");
        request.setPhone("987-654-3210");

        mockMvc.perform(MockMvcRequestBuilders.put("/address")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(objectMapper.writeValueAsString(request)))
                .andExpect(MockMvcResultMatchers.status().isUnauthorized());
    }

    @Test
    void testDeleteAddress_Unauthorized() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.delete("/address/{addressId}", "address_id"))
                .andExpect(MockMvcResultMatchers.status().isUnauthorized());
    }
    */
}

