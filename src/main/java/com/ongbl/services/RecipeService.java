package com.ongbl.services;

import com.ongbl.domain.Recipe;
import java.util.Set;

public interface RecipeService {
    Set<Recipe> getRecipes();
}
