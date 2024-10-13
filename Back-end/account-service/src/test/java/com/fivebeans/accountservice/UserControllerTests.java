package com.fivebeans.accountservice;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fivebeans.accountservice.dto.CreateRoleRequest;
import com.fivebeans.accountservice.dto.CreateUserRequest;
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

class UserControllerTests {
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
    void testCreateUser_Unauthorized() throws Exception {
        CreateUserRequest request = new CreateUserRequest();
        request.setUserName("testUser");
        request.setPassword("password");
        request.setFirstName("John");
        request.setEmail("test@example.com");

        mockMvc.perform(MockMvcRequestBuilders.post("/user")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(objectMapper.writeValueAsString(request)))
                .andExpect(MockMvcResultMatchers.status().isUnauthorized());
    }

    @Test
    void testGetUser_Unauthorized() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/user"))
                .andExpect(MockMvcResultMatchers.status().isUnauthorized());
    }

    @Test
    void testUpdateUser_Unauthorized() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.put("/user/{userId}", "user_id")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content("{}")) // Assuming an empty update request for simplicity
                .andExpect(MockMvcResultMatchers.status().isUnauthorized());
    }

    @Test
    void testGetAllUsers_Unauthorized() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/users"))
                .andExpect(MockMvcResultMatchers.status().isUnauthorized());
    }

    @Test
    void testGetUserInfo_Unauthorized() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/userInfo"))
                .andExpect(MockMvcResultMatchers.status().isUnauthorized());
    }

    @Test
    void testUpdateUserInfo_Unauthorized() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.put("/userInfo")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content("{}")) // Assuming an empty update request for simplicity
                .andExpect(MockMvcResultMatchers.status().isUnauthorized());
    }

    @Test
    void testDeleteUserById_Unauthorized() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.delete("/user/{userId}", "user_id"))
                .andExpect(MockMvcResultMatchers.status().isUnauthorized());
    }

 */
}
