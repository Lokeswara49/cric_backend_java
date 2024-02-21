package com.exam.cricbuzz.service;

import com.exam.cricbuzz.dao.BenefitsDao;
import com.exam.cricbuzz.domain.Benefits;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BenefitsService {

    @Autowired
    private BenefitsDao benefitsDao;

    public List<Benefits> getBenefits(){
        return benefitsDao.getBenefits();
    }

}
