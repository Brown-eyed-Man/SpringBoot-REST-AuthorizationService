package ru.netology.restauthorizationservice.domain;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
public class User {
    private String name;
    private String password;
    private List<Authorities> authorities;

    public User(String name, String password, List<Authorities> authorities) {
        this.name = name;
        this.password = password;
        this.authorities = authorities;
    }
}
