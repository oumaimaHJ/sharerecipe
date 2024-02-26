package com.oumaima.sharerecipe.repository;

import com.oumaima.sharerecipe.model.Recipe;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RecipeRepository extends JpaRepository<Recipe, Long> {
}
