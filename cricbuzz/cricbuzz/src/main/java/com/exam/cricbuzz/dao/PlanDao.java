package com.exam.cricbuzz.dao;

import com.exam.cricbuzz.domain.Plan;
import com.exam.cricbuzz.repository.PlanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class PlanDao {

    @Autowired
    private PlanRepository planRepository;

    public List<Plan> getAllPlans(){
        return planRepository.findAll();
    }

    public Plan getMasterPlan(Boolean masterPlan){
        return planRepository.findFirstBymasterPlan(masterPlan);
    }
}
