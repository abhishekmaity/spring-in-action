package com.tacos.repository;

import java.util.Optional;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.data.repository.CrudRepository;

import com.tacos.model.Ingredient;
import com.tacos.model.Ingredient.Type;

public interface IngredientRepository extends CrudRepository<Ingredient, String> {
	Iterable<Ingredient> findAll();

	Optional<Ingredient> findById(String id);

	Ingredient save(Ingredient ingredient);

//	@Bean
//	default CommandLineRunner dataLoader(IngredientRepository repo) {
//		return args -> {
//			repo.save(new Ingredient("FLTO", "Flour Tortilla", Type.WRAP));
//			repo.save(new Ingredient("COTO", "Corn Tortilla", Type.WRAP));
//			repo.save(new Ingredient("GRBF", "Ground Beef", Type.PROTEIN));
//			repo.save(new Ingredient("CARN", "Carnitas", Type.PROTEIN));
//			repo.save(new Ingredient("TMTO", "Diced Tomatoes", Type.VEGGIES));
//			repo.save(new Ingredient("LETC", "Lettuce", Type.VEGGIES));
//			repo.save(new Ingredient("CHED", "Cheddar", Type.CHEESE));
//			repo.save(new Ingredient("JACK", "Monterrey Jack", Type.CHEESE));
//			repo.save(new Ingredient("SLSA", "Salsa", Type.SAUCE));
//			repo.save(new Ingredient("SRCR", "Sour Cream", Type.SAUCE));
//		};
//	}

//	@Bean
//	default ApplicationRunner dataLoader(IngredientRepository repo) {
//		return args -> {
//			List<String> version = args.getOptionValues("version");
	
//			repo.save(new Ingredient("FLTO", "Flour Tortilla", Type.WRAP));
//			repo.save(new Ingredient("COTO", "Corn Tortilla", Type.WRAP));
//			repo.save(new Ingredient("GRBF", "Ground Beef", Type.PROTEIN));
//			repo.save(new Ingredient("CARN", "Carnitas", Type.PROTEIN));
//			repo.save(new Ingredient("TMTO", "Diced Tomatoes", Type.VEGGIES));
//			repo.save(new Ingredient("LETC", "Lettuce", Type.VEGGIES));
//			repo.save(new Ingredient("CHED", "Cheddar", Type.CHEESE));
//			repo.save(new Ingredient("JACK", "Monterrey Jack", Type.CHEESE));
//			repo.save(new Ingredient("SLSA", "Salsa", Type.SAUCE));
//			repo.save(new Ingredient("SRCR", "Sour Cream", Type.SAUCE));
//		};
//	}
}
