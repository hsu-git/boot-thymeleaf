package org.example.bootthymeleaf.model.repository;

import org.example.bootthymeleaf.model.entity.Word;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
// uuid 써서 long이 아니라 String
public interface WordRepository extends JpaRepository<Word, String> {
}
