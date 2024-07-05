package ru.netology.restauthorizationservice.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.netology.restauthorizationservice.controller.AuthorizedController;
import ru.netology.restauthorizationservice.repository.UserRepository;
import ru.netology.restauthorizationservice.service.AuthorizationService;

@Configuration
public class JavaConfig {

    @Bean
    public AuthorizedController authorizedController(AuthorizationService service) {
        return new AuthorizedController(service);
    }

    @Bean
    public AuthorizationService authorizationService(UserRepository repository) {
        return new AuthorizationService(repository);
    }

    @Bean
    public UserRepository userRepository() {
        return new UserRepository();
    }
}
