package com.msa_prac.service;

import com.msa_prac.model.entity.WebBook;
import com.msa_prac.model.entity.WebBookChapter;
import com.msa_prac.model.form.RegisterWebBookChapterForm;
import com.msa_prac.model.form.RegisterWebBookForm;
import com.msa_prac.repository.WebBookChapterRepository;
import com.msa_prac.repository.WebBookRepository;
import com.msa_prac.repository.WriterRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@RequiredArgsConstructor
public class WriterWebBookService {

    private final WriterRepository writerRepository;
    private final WebBookRepository webBookRepository;
    private final WebBookChapterRepository webBookChapterRepository;

    public Long registerWebBook(Long writerId, RegisterWebBookForm registerWebBookForm) {

        if (writerRepository.existsById(writerId)) {
            return webBookRepository.save(
                    WebBook.builder()
                            .name(registerWebBookForm.getName())
                            .description(registerWebBookForm.getDescription())
                            .createdAt(LocalDateTime.now())
                            .build())
                    .getWebBookId();
        } else {
            return null;
        }
    }

    public Long registerWebBookChapter(Long writerId, Long webBookId, RegisterWebBookChapterForm registerWebBookChapterForm) {
        if (writerRepository.existsById(writerId) && webBookRepository.existsById(webBookId)) {
            return webBookChapterRepository.save(
                    WebBookChapter.builder()
                            .name(registerWebBookChapterForm.getName())
                            .detail(registerWebBookChapterForm.getDetail())
                            .createdAt(LocalDateTime.now())
                            .price(registerWebBookChapterForm.getPrice())
                            .build())
                            .getWebBookChapterId();
        } else {
            return null;
        }
    }
}
