package org.society.repository;


import org.society.entities.ElectionResult;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface ElectionResultRepository extends JpaRepository<ElectionResult, Long> {

	ElectionResult findById(long id);
}
