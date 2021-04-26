package com.pravin.planning.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Plan {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "plan_id")
	private int id;

	@Column(name = "plan_title")
	private String title;

	@Column(name = "plan_description")
	private String description;

	@Column(name = "plan_dueDate")
	private Date date;

	public Plan() {
		// TODO Auto-generated constructor stub
	}
	
	public Plan(String title, String description, Date date) {
		super();
		this.title = title;
		this.description = description;
		this.date = date;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "Plan [id=" + id + ", title=" + title + ", description=" + description + ", date=" + date + "]";
	}

}
