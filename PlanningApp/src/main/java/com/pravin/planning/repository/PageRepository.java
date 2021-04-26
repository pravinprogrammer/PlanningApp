package com.pravin.planning.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.pravin.planning.model.Plan;

public interface PageRepository extends PagingAndSortingRepository<Plan, Integer> {

}
