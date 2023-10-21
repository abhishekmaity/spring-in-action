package com.tacos.model;

import java.util.Date;
import java.util.List;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class Taco {
	@NotNull
	@Size(min=5, message="Name must be at least 5 characters long")
	private String name;
	
	@NotNull
	@Size(min=1, message="You must choose at least 1 ingredient")
	private List<IngredientRef> ingredients;
	
	private Long id;
	
	private Date createdAt = new Date();
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@NotNull 
	@Size(min = 1, message = "You must choose at least 1 ingredient")
	public List<IngredientRef> getIngredients() {
		return ingredients;
	}
	public void setIngredients(List<IngredientRef> ingredients) {
		this.ingredients = ingredients;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Date getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}
}
