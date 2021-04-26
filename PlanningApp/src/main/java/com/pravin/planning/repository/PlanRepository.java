package com.pravin.planning.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pravin.planning.model.Plan;

public interface PlanRepository extends JpaRepository<Plan, Integer> {

}
