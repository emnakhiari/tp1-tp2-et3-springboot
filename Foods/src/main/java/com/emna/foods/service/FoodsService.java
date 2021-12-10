package com.emna.foods.service;

import java.util.List;

import com.emna.foods.entities.Foods;
import com.emna.foods.entities.Types;

public interface FoodsService {
	Foods saveFoods(Foods p);
	Foods updateFoods(Foods p);
	void deleteFoods(Foods p);
	void deleteFoodsById(Long id);
	Foods getFoods(Long id);
	List<Foods> getAllFoods();
	List<Foods> findByNomFoods(String nom);
	List<Foods> findByNomFoodsContains(String nom);
	List<Foods> findByNomPrix (String nom, Double prix);
	List<Foods> findByOrderByNomFoodsAsc();
	List<Foods> trierFoodsNomsPrix();
	List<Foods> findByTypes(Types Types);
	List<Foods> findByTypesIdTypes(long l);
	



}
