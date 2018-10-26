package com.sprintinaction.tacocloud.data;

import com.sprintinaction.tacocloud.models.Ingredient;

public interface IngredientRepository {
    Iterable<Ingredient> findAll();
    Ingredient findOne(String id);
    Ingredient save(Ingredient ingredient);
}
