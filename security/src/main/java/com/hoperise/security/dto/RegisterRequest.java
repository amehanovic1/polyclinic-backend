package com.hoperise.security.dto;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RegisterRequest {

    @NotNull(message = "Firstname must be specified!")
    private String firstname;

    @NotNull(message = "Lastname must be specified!")
    private String lastname;

    @NotNull(message = "Username must be specified!")
    private String username;

    @NotNull(message = "Email address must be specified!")
    private String email;

    @NotNull(message = "Password must be specified!")
    private String password;

    private String phoneNumber;


    private String address;

}