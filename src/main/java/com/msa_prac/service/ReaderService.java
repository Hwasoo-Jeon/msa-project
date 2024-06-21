package com.msa_prac.service;

import com.msa_prac.model.entity.Reader;
import com.msa_prac.model.form.RegisterReaderForm;
import com.msa_prac.repository.ReaderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
/**
 * Reader에 대한 CRUD
 */
@RequiredArgsConstructor
public class ReaderService {

    private final ReaderRepository ReaderRepository;

    public Long registerReader(RegisterReaderForm registerReaderForm) {

        return ReaderRepository.save(
                Reader.builder()
                        .name(registerReaderForm.getName())
                        .createdAt(LocalDateTime.now()).build()
        ).getReaderId();

    }
}
