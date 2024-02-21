package com.exam.cricbuzz.service;

import com.exam.cricbuzz.domain.Benefits;
import com.exam.cricbuzz.domain.Plan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CricbuzzPlusService {

    @Autowired
    private BenefitsService benefitsService;

    @Autowired
    private PlanService planService;

    public List<Benefits> getBenefits(){
       return benefitsService.getBenefits();
    }

    public List<Plan> getAllPlans(){
        return planService.getAllPlans();
    }

    public Plan getMasterPlan(){
        return planService.getMasterPlan();
    }
}
