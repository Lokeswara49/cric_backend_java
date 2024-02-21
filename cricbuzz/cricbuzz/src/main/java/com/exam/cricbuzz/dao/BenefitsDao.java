package com.exam.cricbuzz.dao;

import com.exam.cricbuzz.domain.Benefits;
import com.exam.cricbuzz.repository.BenefitsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class BenefitsDao {

    @Autowired
    private BenefitsRepository benefitsRepository;
    public List<Benefits> getBenefits(){
        return benefitsRepository.findAll();
    }
}
