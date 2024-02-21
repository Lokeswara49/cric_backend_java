package com.exam.cricbuzz.repository;

import com.exam.cricbuzz.domain.Benefits;
import com.exam.cricbuzz.domain.Plan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PlanRepository extends JpaRepository<Plan, Integer> {

    Plan findFirstBymasterPlan(Boolean isMasterPlan);
}
