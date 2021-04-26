package com.pravin.planning.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.pravin.planning.model.Plan;


@Repository
public class PlanDao {
	
	@Autowired
	PlanRepository planRepository;
	
	
	public void addPlan(Plan plan) {		
		planRepository.save(plan);
	}


	public List<Plan> getAllPlans() {
		List<Plan> list =  planRepository.findAll();
		return list;
	}


	public Plan getPlanDetails(int id) {
			
				Plan plan = planRepository.findById(id).get();
				return plan;		
	}


	public void deletePlan(int id) {
		planRepository.deleteById(id);
	}
	

}
