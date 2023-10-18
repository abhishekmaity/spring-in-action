package com.tacos.repository;

import java.util.Optional;

import com.tacos.model.Ingredient;

public interface IngredientRepository {
	Iterable<Ingredient> findAll();

	Optional<Ingredient> findById(String id);

	Ingredient save(Ingredient ingredient);
}
