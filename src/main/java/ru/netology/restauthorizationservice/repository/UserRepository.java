package ru.netology.restauthorizationservice.repository;

import org.springframework.stereotype.Repository;
import ru.netology.restauthorizationservice.domain.User;
import ru.netology.restauthorizationservice.domain.Authorities;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class UserRepository {
    private static final List<User> users = List.of(
            new User("Tom", "KillJerry", List.of(Authorities.READ, Authorities.WRITE, Authorities.DELETE)),
            new User("Jerry", "TomIsBadCat", List.of(Authorities.READ, Authorities.WRITE)),
            new User("Dog", "ProtectJerry", new ArrayList<>())
    );

    public List<Authorities> getUserAuthorities(String user, String password) {
        Optional<User> searchUser = users.stream()
                .filter(u -> u.getName().equals(user) && u.getPassword().equals(password))
                .findFirst();
        return searchUser.isPresent() ? searchUser.get().getAuthorities() : List.of();

    }
}
