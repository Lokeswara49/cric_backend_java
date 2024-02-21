package com.exam.cricbuzz.repository;

import com.exam.cricbuzz.domain.Benefits;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface BenefitsRepository extends JpaRepository<Benefits, Integer> {
}
