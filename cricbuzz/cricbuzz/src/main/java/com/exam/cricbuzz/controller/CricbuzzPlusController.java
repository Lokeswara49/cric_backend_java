package com.exam.cricbuzz.controller;

import com.exam.cricbuzz.domain.Benefits;
import com.exam.cricbuzz.domain.Plan;
import com.exam.cricbuzz.service.CricbuzzPlusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/cricbuzzPlus")
public class CricbuzzPlusController {

    @Autowired
    private CricbuzzPlusService cricbuzzPlusService;

    @GetMapping("/benefits")
    public List<Benefits> getBenefits(){
        return cricbuzzPlusService.getBenefits();
    }

    @GetMapping("/plans")
    public List<Plan> getAllPlans(){
        return cricbuzzPlusService.getAllPlans();
    }

    @GetMapping("/plans/masterPlan")
    public Plan getMasterPlan(){
        return cricbuzzPlusService.getMasterPlan();
    }

}
