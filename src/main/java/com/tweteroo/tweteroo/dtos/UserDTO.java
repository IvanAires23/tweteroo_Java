package com.tweteroo.tweteroo.dtos;

import org.hibernate.validator.constraints.Length;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class UserDTO {

    @NotBlank
    @Length(max = 100)
    private String username;

    @NotBlank
    private String avatar;
}
