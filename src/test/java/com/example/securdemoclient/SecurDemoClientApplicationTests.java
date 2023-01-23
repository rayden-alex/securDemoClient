package com.example.securdemoclient;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.security.oauth2.client.registration.ClientRegistrationRepository;

@SpringBootTest

// We had to use a mocked bean to avoid the error on the application context loading:
// "Unable to resolve Configuration with the provided Issuer of "https://mydebian.local:8443/realms/PetClinicRearm""
// See application.yml: spring.security.oauth2.client.provider.keycloak.issuer-uri
@MockBean(ClientRegistrationRepository.class)

class SecurDemoClientApplicationTests {

    @Test
    void contextLoads() {
    }

}
