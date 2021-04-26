package com.pravin.planning.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pravin.planning.model.Plan;
import com.pravin.planning.repository.PageDao;
import com.pravin.planning.repository.PlanDao;

@Service
public class PlanService implements PlanServiceImpl {

	@Autowired
	PlanDao planDao;
	
	@Autowired
	PageDao pageDao;

	public Plan addPlan(Plan plan) {
		planDao.addPlan(plan);

		return plan;
	}

	public List<Plan> getAllPlans() {
		return planDao.getAllPlans();
	}

	public Plan getPlanDetails(int id) {
		// TODO Auto-generated method stub

		return planDao.getPlanDetails(id);

	}

	public void deletePlan(int id) {		
		planDao.deletePlan(id);
	}
	
	public List<Plan> getSortedPlans(){
		return pageDao.getSortedPlans();
	}

}
