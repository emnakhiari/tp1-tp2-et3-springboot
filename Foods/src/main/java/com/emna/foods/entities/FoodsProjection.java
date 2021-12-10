package com.emna.foods.entities;


import org.springframework.data.rest.core.config.Projection;


@Projection(name = "nomFoods", types = { Foods.class })
public interface FoodsProjection {
public String getNomFoods();
}