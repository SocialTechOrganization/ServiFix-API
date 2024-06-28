package com.servifix.restapi.security.model.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class LoginRequestDto {
    @NotBlank(message = "The email is required")
    private String email;

    @NotBlank(message = "The password is required")
    @Size(min = 3, message = "the password must be at least 3 characters long")
    private String password;
}
