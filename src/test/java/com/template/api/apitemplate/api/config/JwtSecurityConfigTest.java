package com.template.api.apitemplate.api.config;

import com.template.api.apitemplate.api.model.dto.response.PlayerResponse;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import static org.junit.jupiter.api.Assertions.assertEquals;

class JwtSecurityConfigTest {

    private TestRestTemplate restTemplate;
    private static final String apiUrl = "http://localhost:8080/api-template/playercard/byname?name=paul";

    @BeforeEach
    public void init() {
        restTemplate = new TestRestTemplate("user", "password");
    }

    @Test
    public void whenLoggedUserRequestsHomePage_ThenSuccess() throws IllegalStateException {
        ResponseEntity<PlayerResponse> response =
                restTemplate.getForEntity(apiUrl, PlayerResponse.class);

        assertEquals(HttpStatus.OK, response.getStatusCode());
    }

    @Test
    public void whenUserWithWrongCredentials_thenUnauthorizedPage() {
        restTemplate = new TestRestTemplate("user", "wrongpassword");
        ResponseEntity<PlayerResponse> response =
                restTemplate.getForEntity(apiUrl, PlayerResponse.class);

        assertEquals(HttpStatus.UNAUTHORIZED, response.getStatusCode());
    }

}