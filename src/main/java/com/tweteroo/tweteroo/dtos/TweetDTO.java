package com.tweteroo.tweteroo.dtos;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class TweetDTO {
    @NotBlank
    private Long userId;

    @NotBlank
    private String text;
}
