package com.exam.cricbuzz.service;

import com.exam.cricbuzz.dao.PlanDao;
import com.exam.cricbuzz.domain.Plan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlanService {

    @Autowired
    private PlanDao planDao;

    public List<Plan> getAllPlans(){
        return planDao.getAllPlans();
    }

    public Plan getMasterPlan(){
        return planDao.getMasterPlan(true);
    }
}
