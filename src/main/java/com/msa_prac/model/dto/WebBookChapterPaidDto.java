package com.msa_prac.model.dto;

import com.msa_prac.model.entity.WebBookChapter;
import lombok.*;

import java.time.LocalDateTime;

@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class WebBookChapterPaidDto {

    private Long webBookChapterId;
    //제목
    private String name;
    //내용
    private String detail;

    private LocalDateTime createdAt;

    private Integer price;

    private Boolean isPaid;

    public static WebBookChapterPaidDto from(WebBookChapter webBookChapter){
        return WebBookChapterPaidDto.builder()
               .webBookChapterId(webBookChapter.getWebBookChapterId())
                .name(webBookChapter.getName())
                .detail(webBookChapter.getDetail())
                .createdAt(webBookChapter.getCreatedAt())
                .price(webBookChapter.getPrice())
                .build();
    }
}
