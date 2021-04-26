package com.pravin.planning.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.pravin.planning.model.Plan;
import com.pravin.planning.service.PlanService;

@RestController
@CrossOrigin
public class PlanController {

	@Autowired
	PlanService planService;

	@PostMapping("/plans/addplan")
	public Plan addPlan(@RequestBody Plan plan) {

		// Date date1=new SimpleDateFormat("dd/MM/yyyy").parse(plan.getDate());

		System.out.println("In add plan...");
		planService.addPlan(plan);
		return plan;
	}

	@GetMapping("/plans/{id}")
	public Plan getPlanDetails(@PathVariable int id) {
		return planService.getPlanDetails(id);
	}

	@GetMapping("/plans/allplans")
	public List<Plan> getAllPlans() {
		return planService.getAllPlans();
	}

	@DeleteMapping("plans/{id}")
	public void deletePlan(@PathVariable int id) {
		planService.deletePlan(id);

	}

	@GetMapping("/plans/getSortedPlans")
	public List<Plan> getSortedPlans() {
		return planService.getSortedPlans();
	}

}
