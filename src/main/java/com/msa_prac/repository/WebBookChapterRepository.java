package com.msa_prac.repository;

import com.msa_prac.model.entity.WebBookChapter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WebBookChapterRepository extends JpaRepository<WebBookChapter,Long> {
}
