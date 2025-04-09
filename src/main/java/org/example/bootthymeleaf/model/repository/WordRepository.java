package org.example.bootthymeleaf.model.repository;

import org.example.bootthymeleaf.model.entity.Word;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
// uuid 써서 long이 아니라 String
public interface WordRepository extends JpaRepository<Word, String> {

    // findAll -> PK (Primary Key : 기본키)
    List<Word> findAllByOrderByCreatedAtDesc(); // 최신순
    // List<Word> findAllByOrderByCreatedAtAsc(); // 오래된순
}
