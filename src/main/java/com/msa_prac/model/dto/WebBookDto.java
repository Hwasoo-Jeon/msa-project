package com.msa_prac.model.dto;

import com.msa_prac.model.entity.WebBook;
import lombok.*;

import java.time.LocalDateTime;

@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class WebBookDto {

    private Long webBookId;
    //제목
    private String name;
    //설명
    private String description;

    private LocalDateTime createdAt;

    // 내가 봤는지?

    public static WebBookDto from(WebBook webBook){
        return WebBookDto.builder()
                .webBookId(webBook.getWebBookId())
                .name(webBook.getName())
                .description(webBook.getDescription())
                .createdAt(webBook.getCreatedAt())
                .build();
    }
}
