package com.msa_prac.repository;

import com.msa_prac.model.entity.WebBook;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WebBookRepository extends JpaRepository<WebBook,Long> {
}
