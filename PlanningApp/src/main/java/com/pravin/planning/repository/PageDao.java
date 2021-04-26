package com.pravin.planning.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Repository;

import com.pravin.planning.model.Plan;


@Repository
public class PageDao{
	
	@Autowired
	PageRepository pageRepository;
	
	
	public List<Plan> getSortedPlans(){
		
		List<Plan> sortedplans = new ArrayList<Plan>(); 
		Iterable<Plan> allSortedPlans = pageRepository.findAll(Sort.by("id"));
		for(Plan plan : allSortedPlans) {
			sortedplans.add(plan);
		}		
		return sortedplans;		
	}
	
	


}
